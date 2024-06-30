package org.example.dexreader.parsers.site.madara.vi

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaChapter
import org.example.dexreader.parsers.model.MangaPage
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser
import org.example.dexreader.parsers.util.*

@MangaSourceParser("QUAANHDAOCUTEO", "Quaanhdaocuteo", "vi", ContentType.HENTAI)
internal class Quaanhdaocuteo(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.QUAANHDAOCUTEO, "quaanhdaocuteo.com") {
	override val datePattern = "dd/MM/yyyy"
	override val selectPage = "p img"

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		val root = doc.body().selectFirstOrThrow(selectBodyPage)
		return root.select(selectPage).map { img ->
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
