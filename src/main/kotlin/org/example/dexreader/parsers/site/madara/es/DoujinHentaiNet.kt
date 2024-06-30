package org.example.dexreader.parsers.site.madara.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaChapter
import org.example.dexreader.parsers.model.MangaPage
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser
import org.example.dexreader.parsers.util.*
import java.util.Locale

@MangaSourceParser("DOUJIN_HENTAI_NET", "DoujinHentai.net", "es", ContentType.HENTAI)
internal class DoujinHentaiNet(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.DOUJIN_HENTAI_NET, "doujinhentai.net", 18) {

	override val datePattern = "dd MMM. yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val listUrl = "lista-manga-hentai/"
	override val tagPrefix = "lista-manga-hentai/category/"
	override val selectTestAsync = "div.listing-chapters_wrap"
	override val selectChapter = "li.wp-manga-chapter:contains(Capitulo)"
	override val selectPage = "div#all img"

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		return doc.select(selectPage).map { div ->
			val img = div.selectFirstOrThrow("img")
			val url = img.src()?.toRelativeUrl(domain) ?: div.parseFailed("Image src not found")
			MangaPage(
				id = generateUid(url),
				url = url,
				preview = null,
				source = source,
			)
		}
	}
}
