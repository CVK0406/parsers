package org.koitharu.kotatsu.parsers.site.vi

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import okhttp3.Headers
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaParser
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.config.ConfigKey
import org.koitharu.kotatsu.parsers.model.*
import org.koitharu.kotatsu.parsers.network.UserAgents
import org.koitharu.kotatsu.parsers.util.*
import java.text.SimpleDateFormat
import java.util.*

private const val PAGE_SIZE = 15
private const val SEARCH_PAGE_SIZE = 10

@MangaSourceParser("HENTAIVN", "HentaiVN", "vi", type = ContentType.HENTAI)
class HentaiVNParser(context: MangaLoaderContext) : MangaParser(context, MangaSource.HENTAIVN) {

	override val configKeyDomain: ConfigKey.Domain = ConfigKey.Domain("hentaivn.autos", "hentaivn.tv")

	// hentaivn has created 2 different interfaces for mobile and desktop, and Cloudflare detects whether it's mobile or not even with a desktop user agent.
	override val headers: Headers = Headers.Builder().add("User-Agent", UserAgents.CHROME_MOBILE).build()

	override val sortOrders: Set<SortOrder> = EnumSet.of(
		SortOrder.UPDATED,
		SortOrder.POPULARITY,
		SortOrder.RATING,
		SortOrder.NEWEST,
	)

	private val tagCache = SuspendLazy(this::fetchTags)

	override suspend fun getDetails(manga: Manga): Manga = coroutineScope {
		val chapterDeferred = async { fetchChapters(manga.url) }
		val docs = webClient.httpGet(manga.url.toAbsoluteUrl(domain)).parseHtml()
		val id = docs.location().substringAfterLast("/").substringBefore("-")

		val genreUrl = Regex(""""(list-info-theloai-mobile\.php?.+)"""").find(docs.toString())?.groupValues?.get(1)

		val genreDeferred = async {
			webClient.httpGet("https://$domain/$genreUrl").parseHtml().select("a.tag")
		}
		val infoElDeferred = async {
			webClient.httpGet("/list-info-all-mobile.php?id_anime=$id".toAbsoluteUrl(domain)).parseHtml()
		}
		val stateDocDeferred = async {
			webClient.httpGet("/list-info-time-mobile.php?id_anime=$id".toAbsoluteUrl(domain)).parseHtml()
		}

		val genre = genreDeferred.await()
		val infoEl = infoElDeferred.await()
		val stateDoc = stateDocDeferred.await()
		manga.copy(
			altTitle = infoEl.infoText("Tên Khác:"),
			author = infoEl.select("p:contains(Tác giả:) a").text(),
			description = infoEl.select("p:contains(Nội dung:) + p").html(),
			tags = tagCache.tryGet().getOrNull()?.let { tagMap ->
				genre.mapNotNullToSet {
					tagMap[it.text()]
				}
			}.orEmpty(),
			state = stateDoc.select("p:contains(Tình Trạng:) a").firstOrNull()?.text()?.let {
				when (it) {
					"Đã hoàn thành" -> MangaState.FINISHED
					"Đang tiến hành" -> MangaState.ONGOING
					else -> null
				}
			},
			rating = docs.selectFirst("div.page_like")?.let {
				val like = it.selectFirst("div.but_like")?.text()?.trim()?.toIntOrNull() ?: return@let null
				val dislike = it.selectFirst("div.but_unlike")?.text()?.trim()?.toIntOrNull() ?: return@let null
				when {
					like == 0 && dislike == 0 -> RATING_UNKNOWN
					else -> like.toFloat() / (like + dislike)
				}
			} ?: RATING_UNKNOWN,
			chapters = chapterDeferred.await(),
		)
	}

	override suspend fun getList(offset: Int, query: String?, tags: Set<MangaTag>?, sortOrder: SortOrder): List<Manga> {
		val pageSize = if (tags.isNullOrEmpty()) PAGE_SIZE else SEARCH_PAGE_SIZE
		val page = (offset / pageSize.toFloat()).toIntUp() + 1
		return when {
			!tags.isNullOrEmpty() -> {
				val url = buildString {
					val tagKey = "tag[]".urlEncoded()
					append("/forum/search-plus.php?name=")
					append(query?.urlEncoded().orEmpty())
					append("&dou=&char=")
					tags.forEach { tag ->
						append("&")
						append(tagKey)
						append("=")
						append(tag.key)
					}
					append("&search=")
					append("&page=")
					append(page)
				}.toAbsoluteUrl(domain)

				val docs = webClient.httpGet(url).parseHtml()
				return parseAdvanceSearch(docs, page)
			}

			!query.isNullOrEmpty() -> {
				urlBuilder()
				val searchUrl = "/tim-kiem-truyen.html?key=${query.urlEncoded()}&page=$page".toAbsoluteUrl(domain)
				val docs = webClient.httpGet(searchUrl).parseHtml()
				parseMainList(docs, page)
			}

			else -> {
				val site = if (sortOrder == SortOrder.UPDATED) "/chap-moi" else "/danh-sach"
				val url = "$site.html?page=$page".toAbsoluteUrl(domain)
				context.cookieJar.insertCookies(domain, *getSortCookies(sortOrder))
				val docs = webClient.httpGet(url).parseHtml()
				parseMainList(docs, page)
			}
		}
	}

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val docs = webClient.httpGet(chapter.url.toAbsoluteUrl(domain)).parseHtml()
		return docs.select("#image > img").map {
			val pageUrl = it.src() ?: throw Exception(it.html())
			MangaPage(
				id = generateUid(pageUrl),
				url = pageUrl,
				preview = null,
				source = source,
			)
		}
	}

	override suspend fun getTags(): Set<MangaTag> {
		return tagCache.get().values.toSet()
	}

	private suspend fun fetchTags(): Map<String, MangaTag> {
		val url = "/forum/search-plus.php".toAbsoluteUrl(domain)
		val docs = webClient.httpGet(url).parseHtml()
		return docs.selectFirstOrThrow("ul.ul-search").select("li").mapNotNull { el ->
			MangaTag(
				title = el.text(),
				key = el.selectFirst("input")?.attr("value") ?: return@mapNotNull null,
				source = source,
			)
		}.associateBy { it.title }
	}

	private fun getSortCookies(sortOrder: SortOrder): Array<String> {
		return mapOf(
			SortOrder.POPULARITY to "view4",
			SortOrder.RATING to "view",
			SortOrder.NEWEST to "view0",
		).map { (order, cookieKey) ->
			val data = if (order == sortOrder) "1" else "0"
			"${cookieKey}=$data"
		}.toTypedArray()
	}

	private fun parseMainList(docs: Document, page: Int): List<Manga> {
		val realPage = docs.selectFirst("div.pagination b.pagination-selected")?.text()?.toIntOrNull() ?: 1
		if (page > realPage) {
			return emptyList()
		}

		return docs.selectFirstOrThrow("div.main").selectFirstOrThrow("div.block-item").select("ul > li.item")
			.map { el ->
				val relativeUrl = el.selectFirstOrThrow("div.box-cover-2 > a").attrAsRelativeUrl("href")
				val descriptionsEl = el.selectFirstOrThrow("div.box-description-2")
				Manga(
					id = generateUid(relativeUrl),
					title = descriptionsEl.selectFirst("a")?.text().orEmpty(),
					altTitle = null,
					url = relativeUrl,
					publicUrl = relativeUrl.toAbsoluteUrl(domain),
					rating = RATING_UNKNOWN,
					isNsfw = true,
					coverUrl = el.selectFirst("div.box-cover-2 img")?.src().orEmpty(),
					tags = emptySet(),
					state = null,
					author = null,
					source = source,
				)
			}
	}

	private fun parseAdvanceSearch(docs: Document, page: Int): List<Manga> {
		val realPage = docs.selectFirst("ul.pagination > li > b")?.text()?.toIntOrNull() ?: 1
		if (page > realPage) {
			return emptyList()
		}

		return docs.requireElementById("main").selectFirstOrThrow("ul.search-ul").select("li.search-li")
			.mapNotNull { el ->
				val titleEl = el.selectFirst("div.search-des > a") ?: return@mapNotNull null
				val relativeUrl = titleEl.attrAsRelativeUrl("href")
				Manga(
					id = generateUid(relativeUrl),
					title = titleEl.text(),
					altTitle = null,
					url = relativeUrl,
					publicUrl = relativeUrl.toAbsoluteUrl(domain),
					rating = RATING_UNKNOWN,
					isNsfw = true,
					coverUrl = el.selectFirst("div.search-img img")?.attrAsAbsoluteUrlOrNull("data-cfsrc").orEmpty(),
					tags = emptySet(),
					state = null,
					author = null,
					source = source,
				)
			}
	}

	private suspend fun fetchChapters(mangaUrl: String): List<MangaChapter> {
		val id = mangaUrl.substringAfterLast("/").substringBefore('-')
		val chaptersAjax = "/list-showchapter.php?idchapshow=$id".toAbsoluteUrl(domain)
		val chaptersEl = webClient.httpGet(chaptersAjax).parseHtml()
		val chapterDateFormat = SimpleDateFormat("dd/MM/yyyy")
		return chaptersEl.select("tbody > tr").mapChapters(reversed = true) { index, element ->
			val titleEl = element.selectFirst("td > a") ?: return@mapChapters null
			val dateStr = element.selectLast("td")?.text()
			MangaChapter(
				id = generateUid(titleEl.attrAsRelativeUrl("href")),
				name = titleEl.text(),
				number = index + 1,
				url = titleEl.attrAsRelativeUrl("href"),
				scanlator = null,
				uploadDate = chapterDateFormat.tryParse(dateStr),
				branch = null,
				source = source,
			)
		}
	}

	private fun Element.infoText(title: String) =
		selectFirst("span.info:contains($title)")?.parent()?.select("span:not(.info) > a")?.joinToString { it.text() }
}

