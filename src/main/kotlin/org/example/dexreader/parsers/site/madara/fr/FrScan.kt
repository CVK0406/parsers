package org.example.dexreader.parsers.site.madara.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaChapter
import org.example.dexreader.parsers.model.MangaPage
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser
import org.example.dexreader.parsers.util.*

@MangaSourceParser("FRSCAN", "Fr-Scan", "fr")
internal class FrScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.FRSCAN, "fr-scan.com") {
	override val stylePage = ""

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		val preloadImg = doc.getElementById("chapter_preloaded_images")
		if (preloadImg != null) {
			val img = preloadImg.data().substringAfter("[").substringBeforeLast("]")
				.replace("\\", "").replace("\"", "").split(",")
			return img.map { url ->
				MangaPage(
					id = generateUid(url),
					url = url,
					preview = null,
					source = source,
				)
			}
		} else {
			return doc.body().selectFirstOrThrow(selectBodyPage).select(selectPage).map { div ->
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
}
