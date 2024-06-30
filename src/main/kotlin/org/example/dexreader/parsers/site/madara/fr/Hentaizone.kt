package org.example.dexreader.parsers.site.madara.fr

import org.jsoup.nodes.Document
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.Manga
import org.example.dexreader.parsers.model.MangaChapter
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser
import org.example.dexreader.parsers.util.*
import java.text.SimpleDateFormat
import java.util.*

@MangaSourceParser("HENTAIZONE", "HentaiZone", "fr", ContentType.HENTAI)
internal class Hentaizone(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.HENTAIZONE, "hentaizone.xyz", pageSize = 10) {

	override val datePattern = "MMM d, yyyy"
	override val sourceLocale: Locale = Locale.FRENCH


	override suspend fun getChapters(manga: Manga, doc: Document): List<MangaChapter> {
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return doc.body().select(selectChapter).mapChapters(reversed = true) { i, li ->
			val a = li.selectFirst("a")
			val href = a?.attrAsRelativeUrlOrNull("href") ?: li.parseFailed("Link is missing")
			val link = href + stylePage
			val dateText = li.selectFirst("a.c-new-tag")?.attr("title") ?: li.selectFirst(selectDate)?.text()
			val dateCorrectParse = dateReplace(dateText ?: "janv 1, 1970")
			val name = a.selectFirst("p")?.text() ?: a.ownText()
			MangaChapter(
				id = generateUid(href),
				name = name,
				number = i + 1,
				url = link,
				uploadDate = parseChapterDate(
					dateFormat,
					dateCorrectParse,
				),
				source = source,
				scanlator = null,
				branch = null,
			)
		}
	}

	private fun dateReplace(date: String): String {
		return date.lowercase()
			.replace("jan", "janv.")
			.replace("fév", "févr.")
			.replace("mar", "mars")
			.replace("avr", "avr.")
			.replace("juil", "juil.")
			.replace("sep", "sept.")
			.replace("nov", "nov.")
			.replace("oct", "oct.")
			.replace("déc", "déc.")
	}
}
