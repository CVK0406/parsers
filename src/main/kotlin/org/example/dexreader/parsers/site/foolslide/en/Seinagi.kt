package org.example.dexreader.parsers.site.foolslide.en

import kotlinx.coroutines.coroutineScope
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.*
import org.example.dexreader.parsers.site.foolslide.FoolSlideParser
import org.example.dexreader.parsers.util.*

@MangaSourceParser("SEINAGI", "Seinagi", "en")
internal class Seinagi(context: MangaLoaderContext) :
	FoolSlideParser(context, MangaSource.SEINAGI, "reader.seinagi.org.es") {

	override val pagination = false

	override suspend fun getDetails(manga: Manga): Manga = coroutineScope {
		val fullUrl = manga.url.toAbsoluteUrl(domain)
		val testAdultPage = webClient.httpGet(fullUrl).parseHtml()
		val doc = if (testAdultPage.selectFirst("div.info form") != null) {
			webClient.httpPost(fullUrl, "adult=true").parseHtml()
		} else {
			testAdultPage
		}
		val chapters = getChapters(doc)
		val desc = if (doc.selectFirstOrThrow(selectInfo).html().contains("Description")) {
			doc.selectFirstOrThrow(selectInfo).text().substringAfter("Description: ").substringBefore("Readings")
		} else {
			doc.selectFirstOrThrow(selectInfo).text()
		}
		val author = if (doc.selectFirstOrThrow(selectInfo).html().contains("Author")) {
			doc.selectFirstOrThrow(selectInfo).text().substringAfter("Author: ").substringBefore("Art")
		} else {
			null
		}
		manga.copy(
			coverUrl = doc.selectFirst(".thumbnail img")?.src() ?: manga.coverUrl,
			description = desc,
			altTitle = null,
			author = author,
			state = null,
			chapters = chapters,
		)
	}
}
