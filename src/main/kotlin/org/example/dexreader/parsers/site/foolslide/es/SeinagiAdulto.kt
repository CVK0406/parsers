package org.example.dexreader.parsers.site.foolslide.es

import kotlinx.coroutines.coroutineScope
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.Manga
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.foolslide.FoolSlideParser
import org.example.dexreader.parsers.util.domain
import org.example.dexreader.parsers.util.parseHtml
import org.example.dexreader.parsers.util.selectFirstOrThrow
import org.example.dexreader.parsers.util.src
import org.example.dexreader.parsers.util.toAbsoluteUrl

@MangaSourceParser("SEINAGIADULTO", "Seinagi Adulto", "es", ContentType.HENTAI)
internal class SeinagiAdulto(context: MangaLoaderContext) :
	FoolSlideParser(context, MangaSource.SEINAGIADULTO, "adulto.seinagi.org.es") {

	override suspend fun getDetails(manga: Manga): Manga = coroutineScope {
		val fullUrl = manga.url.toAbsoluteUrl(domain)
		val testAdultPage = webClient.httpGet(fullUrl).parseHtml()
		val doc = if (testAdultPage.selectFirst("div.info form") != null) {
			webClient.httpPost(fullUrl, "adult=true").parseHtml()
		} else {
			testAdultPage
		}
		val chapters = getChapters(doc)
		val desc = if (doc.selectFirstOrThrow(selectInfo).html().contains("Descripción")) {
			doc.selectFirstOrThrow(selectInfo).text().substringAfter("Descripción: ").substringBefore("Lecturas")
		} else {
			doc.selectFirstOrThrow(selectInfo).text()
		}
		val author = if (doc.selectFirstOrThrow(selectInfo).html().contains("Author")) {
			doc.selectFirstOrThrow(selectInfo).text().substringAfter("Author: ").substringBefore("Art")
		} else {
			null
		}
		manga.copy(
			coverUrl = doc.selectFirst(".thumbnail img")?.src().orEmpty(),// for manga result on search
			description = desc,
			altTitle = null,
			author = author,
			state = null,
			chapters = chapters,
		)
	}
}
