package org.example.dexreader.parsers.site.mangareader.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaChapter
import org.example.dexreader.parsers.model.MangaPage
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser
import org.example.dexreader.parsers.util.*
import java.util.Locale

@MangaSourceParser("LELMANGA", "LelManga", "fr")
internal class LelManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.LELMANGA, "www.lelmanga.com", pageSize = 21, searchPageSize = 20) {

	override val sourceLocale: Locale = Locale.ENGLISH

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		val root = doc.body().selectFirstOrThrow("div.maincontent").requireElementById("readerarea")
		return root.select("img").map { img ->
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
