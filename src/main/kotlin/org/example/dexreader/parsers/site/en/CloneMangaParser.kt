package org.example.dexreader.parsers.site.en

import org.example.dexreader.parsers.InternalParsersApi
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaParser
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.config.ConfigKey
import org.example.dexreader.parsers.model.*
import org.example.dexreader.parsers.util.*
import java.util.*

@MangaSourceParser("CLONEMANGA", "CloneManga", "en")
internal class CloneMangaParser(context: MangaLoaderContext) : MangaParser(context, MangaSource.CLONEMANGA) {

	override val availableSortOrders: Set<SortOrder> = Collections.singleton(
		SortOrder.POPULARITY,
	)

	override val configKeyDomain = ConfigKey.Domain("manga.clone-army.org")

	@InternalParsersApi
	override suspend fun getList(offset: Int, filter: MangaListFilter?): List<Manga> {

		val link = when (filter) {
			is MangaListFilter.Search -> {
				return emptyList()
			}

			is MangaListFilter.Advanced -> {
				if (offset > 0) {
					return emptyList()
				}

				"https://$domain/viewer_landing.php"
			}

			null -> "https://$domain/viewer_landing.php"

		}

		val doc = webClient.httpGet(link).parseHtml()
		val mangas = doc.getElementsByClass("comicPreviewContainer")
		return mangas.mapNotNull { item ->
			val background = item.selectFirstOrThrow(".comicPreview").styleValueOrNull("background")
			val href = item.selectFirst("a")?.attrAsRelativeUrl("href") ?: return@mapNotNull null
			val cover = background?.substring(background.indexOf("site/themes"), background.indexOf(")"))
			Manga(
				id = generateUid(href),
				title = item.selectFirst("h3")?.text() ?: return@mapNotNull null,
				coverUrl = "https://$domain/$cover",
				altTitle = null,
				author = "Dan Kim",
				rating = RATING_UNKNOWN,
				url = href,
				isNsfw = false,
				tags = emptySet(),
				state = null,
				publicUrl = href.toAbsoluteUrl(domain),
				source = source,
			)
		}
	}

	override suspend fun getDetails(manga: Manga): Manga {
		val doc = webClient.httpGet(manga.publicUrl).parseHtml()
		val series = doc.location()
		val numChapters = Regex(
			pattern = "&page=(.*)&lang=",
		).findAll(
			input = doc.getElementsByTag("script")[3].toString(),
		)
			.elementAt(3).destructured.component1()
			.toInt()
		val chapters = ArrayList<MangaChapter>()
		for (i in 0..numChapters) {
			val chapter = MangaChapter(
				id = generateUid("$series&page=$i"),
				name = "Chapter ${i + 1}",
				number = i + 1,
				url = "$series&page=$i",
				scanlator = null,
				branch = null,
				uploadDate = 0L,
				source = source,
			)
			chapters.add(chapter)
		}
		return manga.copy(chapters = chapters)
	}

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val doc = webClient.httpGet(chapter.url.toAbsoluteUrl(domain)).parseHtml()
		val imgUrl = doc.getElementsByClass("subsectionContainer")[0]
			.selectFirst("img")
			?.attrAsAbsoluteUrlOrNull("src") ?: doc.parseFailed("Something broken")
		return listOf(
			MangaPage(
				id = generateUid(imgUrl),
				url = imgUrl,
				preview = null,
				source = source,
			),
		)
	}

	override suspend fun getAvailableTags(): Set<MangaTag> = emptySet()
}
