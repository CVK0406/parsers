package org.example.dexreader.parsers.site.madara.all

import org.jsoup.nodes.Document
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.Manga
import org.example.dexreader.parsers.model.MangaChapter
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser
import org.example.dexreader.parsers.util.attrAsRelativeUrlOrNull
import org.example.dexreader.parsers.util.generateUid
import org.example.dexreader.parsers.util.mapChapters
import org.example.dexreader.parsers.util.parseFailed
import java.text.SimpleDateFormat

@MangaSourceParser("MANHWARAW", "ManhwaRaw", "", ContentType.HENTAI)
internal class ManhwaRaw(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANHWARAW, "manhwa-raw.com", 10) {
	override val datePattern = "MM/dd"
	override val withoutAjax = true

	override suspend fun getChapters(manga: Manga, doc: Document): List<MangaChapter> {
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return doc.body().select(selectChapter).mapChapters(reversed = true) { i, li ->
			val a = li.selectFirst("a")
			val href = a?.attrAsRelativeUrlOrNull("href") ?: li.parseFailed("Link is missing")
			val link = href + stylePage
			val dateText = li.selectFirst("a.c-new-tag")?.attr("title") ?: li.selectFirst(selectDate)?.text()
			val name = a.selectFirst("h4")?.text() ?: a.ownText()
			MangaChapter(
				id = generateUid(href),
				name = name,
				number = i + 1,
				url = link,
				uploadDate = if (dateText == "Newly Published!") {
					parseChapterDate(
						dateFormat,
						"today",
					)
				} else {
					parseChapterDate(
						dateFormat,
						dateText,
					)
				},
				source = source,
				scanlator = null,
				branch = null,
			)
		}
	}
}
