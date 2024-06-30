package org.example.dexreader.parsers.site.heancmsalt.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.Manga
import org.example.dexreader.parsers.model.MangaChapter
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.heancmsalt.HeanCmsAlt
import org.example.dexreader.parsers.util.attrAsRelativeUrl
import org.example.dexreader.parsers.util.domain
import org.example.dexreader.parsers.util.generateUid
import org.example.dexreader.parsers.util.mapChapters
import org.example.dexreader.parsers.util.parseHtml
import org.example.dexreader.parsers.util.selectFirstOrThrow
import org.example.dexreader.parsers.util.toAbsoluteUrl
import java.text.SimpleDateFormat

@MangaSourceParser("BRAKEOUT", "Brakeout", "es")
internal class Brakeout(context: MangaLoaderContext) :
	HeanCmsAlt(context, MangaSource.BRAKEOUT, "brakeout.xyz", 10) {
	override val selectManga = "div.grid.grid-cols-2 figure"
	override val selectMangaTitle = "figcaption"

	override val selectDesc = "#section-sinopsis p"
	override val selectChapter = ".grid-capitulos div.contenedor-capitulo-miniatura"
	override val selectChapterTitle = "#name"
	override val selectChapterDate = "time"
	override val datePattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'"
	override suspend fun getDetails(manga: Manga): Manga {
		val fullUrl = manga.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return manga.copy(
			altTitle = doc.selectFirst(selectAlt)?.text().orEmpty(),
			description = doc.selectFirstOrThrow(selectDesc).html(),
			chapters = doc.select(selectChapter)
				.mapChapters(reversed = true) { i, div ->
					val a = div.selectFirstOrThrow("a")
					val dateText = div.selectFirstOrThrow(selectChapterDate).text()
					val url = a.attrAsRelativeUrl("href").toAbsoluteUrl(domain)
					MangaChapter(
						id = generateUid(url),
						name = div.selectFirstOrThrow(selectChapterTitle).text(),
						number = i + 1,
						url = url,
						scanlator = null,
						uploadDate = parseChapterDate(
							dateFormat,
							dateText,
						),
						branch = null,
						source = source,
					)
				},
		)
	}

	override val selectPage = "section img.readImg"
}
