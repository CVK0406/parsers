package org.example.dexreader.parsers.site.fmreader.ja

import org.jsoup.nodes.Document
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.*
import org.example.dexreader.parsers.site.fmreader.FmreaderParser
import org.example.dexreader.parsers.util.*
import java.text.SimpleDateFormat

@MangaSourceParser("KLZ9", "Klz9", "ja")
internal class Klz9(context: MangaLoaderContext) :
	FmreaderParser(context, MangaSource.KLZ9, "klz9.com") {

	override val selectDesc = "div.row:contains(Description)"
	override val selectState = "ul.manga-info li:contains(Status) a"
	override val selectAlt = "ul.manga-info li:contains(Other name (s))"
	override val selectTag = "ul.manga-info li:contains(Genre(s)) a"
	override val selectChapter = "tr"
	override val selectDate = "td i"
	override val selectPage = "img"
	override val selectBodyTag = "div.panel-body a"

	override fun parseMangaList(doc: Document): List<Manga> {
		return doc.select("div.thumb-item-flow").map { div ->
			val href = "/" + div.selectFirstOrThrow("a").attrAsRelativeUrl("href")
			Manga(
				id = generateUid(href),
				url = href,
				publicUrl = href.toAbsoluteUrl(div.host ?: domain),
				coverUrl = div.selectFirstOrThrow("div.img-in-ratio").attr("style").substringAfter("('")
					.substringBeforeLast("')"),
				title = div.selectFirstOrThrow("div.series-title").text().orEmpty(),
				altTitle = null,
				rating = RATING_UNKNOWN,
				tags = emptySet(),
				author = null,
				state = null,
				source = source,
				isNsfw = isNsfwSource,
			)
		}
	}

	override suspend fun getChapters(doc: Document): List<MangaChapter> {
		val slug = doc.selectFirstOrThrow("div.h0rating").attr("slug")
		val docLoad =
			webClient.httpGet("https://$domain/app/manga/controllers/cont.listChapter.php?slug=$slug").parseHtml()
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return docLoad.body().select(selectChapter).mapChapters(reversed = true) { i, a ->
			val href = "/" + a.selectFirstOrThrow("a.chapter").attrAsRelativeUrl("href")
			val dateText = a.selectFirst(selectDate)?.text()
			MangaChapter(
				id = generateUid(href),
				name = a.selectFirstOrThrow("a").text(),
				number = i + 1,
				url = href,
				uploadDate = parseChapterDate(
					dateFormat,
					dateText,
				),
				source = source,
				scanlator = null,
				branch = null,
			)
		}
	}

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		val cid = doc.selectFirstOrThrow("#chapter").attr("value")
		val docLoad = webClient.httpGet("https://$domain/app/manga/controllers/cont.listImg.php?cid=$cid").parseHtml()
		return docLoad.select(selectPage).map { img ->
			val url = img.src()?.toRelativeUrl(domain) ?: img.parseFailed("Image src not found")
			MangaPage(
				id = generateUid(url),
				url = url,
				preview = null,
				source = source,
			)
		}
	}

}
