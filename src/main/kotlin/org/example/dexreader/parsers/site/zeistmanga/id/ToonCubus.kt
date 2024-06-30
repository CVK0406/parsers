package org.example.dexreader.parsers.site.zeistmanga.id

import org.jsoup.nodes.Document
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaChapter
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.model.MangaTag
import org.example.dexreader.parsers.site.zeistmanga.ZeistMangaParser
import org.example.dexreader.parsers.util.*

@MangaSourceParser("TOONCUBUS", "ToonCubus", "id", ContentType.HENTAI)
internal class ToonCubus(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaSource.TOONCUBUS, "www.tooncubus.top") {
	override suspend fun getAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain/p/genre-list.html").parseHtml()
		return doc.select(".dzdes-genre ul li a").mapNotNullToSet {
			MangaTag(
				key = it.attr("href").removeSuffix("/").substringAfterLast("/"),
				title = it.selectFirstOrThrow("span").text(),
				source = source,
			)
		}
	}

	override suspend fun loadChapters(mangaUrl: String, doc: Document): List<MangaChapter> {
		return doc.selectFirstOrThrow("ul.series-chapterlist").select("div.flexch-infoz")
			.mapChapters(reversed = true) { i, div ->
				val url = div.selectFirstOrThrow("a").attr("href")
				val name = div.selectFirstOrThrow("a span").text()
				MangaChapter(
					id = generateUid(url),
					url = url,
					name = name,
					number = i + 1,
					branch = null,
					uploadDate = 0,
					scanlator = null,
					source = source,
				)
			}
	}
}
