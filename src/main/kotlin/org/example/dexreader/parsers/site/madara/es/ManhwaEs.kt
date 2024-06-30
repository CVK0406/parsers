package org.example.dexreader.parsers.site.madara.es

import org.jsoup.nodes.Document
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.*
import org.example.dexreader.parsers.site.madara.MadaraParser
import org.example.dexreader.parsers.util.*
import java.text.SimpleDateFormat

@MangaSourceParser("MANHWA_ES", "Manhwa-Es", "es")
internal class ManhwaEs(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANHWA_ES, "manhwa-es.com", 10) {

	override val withoutAjax = true
	override val datePattern = "MM/dd"

	override suspend fun getChapters(manga: Manga, doc: Document): List<MangaChapter> {
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return doc.body().select(selectChapter).mapChapters(reversed = true) { i, li ->
			val a = li.selectFirstOrThrow("a")
			val href = a.attrAsRelativeUrl("href")
			val link = href + stylePage
			val dateText = li.selectFirst("a.c-new-tag")?.attr("title") ?: li.selectFirst(selectDate)?.text()

			val name = li.selectFirstOrThrow(".mini-letters a").text()
			MangaChapter(
				id = generateUid(href),
				name = name,
				number = i + 1,
				url = link,
				uploadDate = if (dateText == "¡Recién publicado!") {
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
