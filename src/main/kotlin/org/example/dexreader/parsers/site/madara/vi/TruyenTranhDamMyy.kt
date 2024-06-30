package org.example.dexreader.parsers.site.madara.vi

import org.jsoup.nodes.Document
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaChapter
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser
import org.example.dexreader.parsers.util.*

@MangaSourceParser("TRUYENTRANHDAMMYY", "TruyenTranhDamMyy", "vi")
internal class TruyenTranhDamMyy(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.TRUYENTRANHDAMMYY, "truyentranhdammyy.net") {
	override val postReq = true
	override suspend fun loadChapters(mangaUrl: String, document: Document): List<MangaChapter> {
		val mangaId = document.select("div#manga-chapters-holder").attr("data-id")
		val url = "https://$domain/wp-admin/admin-ajax.php"
		val postData = "action=manga_get_chapters&manga=$mangaId"
		val doc = webClient.httpPost(url, postData).parseHtml()
		return doc.select(selectChapter).mapChapters(reversed = true) { i, li ->
			val a = li.selectFirst("a")
			val href = a?.attrAsRelativeUrlOrNull("href") ?: li.parseFailed("Link is missing")
			val link = href + stylePage
			val name = a.selectFirst("p")?.text() ?: a.ownText()
			MangaChapter(
				id = generateUid(href),
				url = link,
				name = name,
				number = i + 1,
				branch = null,
				uploadDate = 0, // Correct datePattern not found.
				scanlator = null,
				source = source,
			)
		}
	}
}
