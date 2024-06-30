package org.example.dexreader.parsers.site.madtheme.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaChapter
import org.example.dexreader.parsers.model.MangaPage
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madtheme.MadthemeParser
import org.example.dexreader.parsers.util.domain
import org.example.dexreader.parsers.util.generateUid
import org.example.dexreader.parsers.util.parseHtml
import org.example.dexreader.parsers.util.selectFirstOrThrow
import org.example.dexreader.parsers.util.toAbsoluteUrl
import java.util.ArrayList

@MangaSourceParser("MANGABUDDY", "MangaBuddy", "en")
internal class MangaBuddy(context: MangaLoaderContext) :
	MadthemeParser(context, MangaSource.MANGABUDDY, "mangabuddy.com") {

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val chapterUrl = chapter.url.toAbsoluteUrl(domain)
		val docs = webClient.httpGet(chapterUrl).parseHtml()
		val script = docs.selectFirstOrThrow("script:containsData(chapImages)")
		val images = script.data().substringAfter("'").substringBeforeLast("'").split(",")
		val pages = ArrayList<MangaPage>(images.size)
		for (image in images) {
			pages.add(
				MangaPage(
					id = generateUid(image),
					url = image,
					preview = null,
					source = source,
				),
			)
		}
		return pages
	}
}
