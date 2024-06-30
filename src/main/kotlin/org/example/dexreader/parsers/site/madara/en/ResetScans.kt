package org.example.dexreader.parsers.site.madara.en

import org.jsoup.nodes.Document
import org.jsoup.select.Elements
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaChapter
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser
import org.example.dexreader.parsers.util.*
import java.text.SimpleDateFormat
import java.util.Collections.emptyMap

@MangaSourceParser("RESETSCANS", "ResetScans", "en")
internal class ResetScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.RESETSCANS, "reset-scans.xyz", 18) {
	override val datePattern = "MMM dd"

	override suspend fun loadChapters(mangaUrl: String, document: Document): List<MangaChapter> {
		val doc = if (postReq) {
			val mangaId = document.select("div#manga-chapters-holder").attr("data-id")
			val url = "https://$domain/wp-admin/admin-ajax.php"
			val postData = "action=manga_get_chapters&manga=$mangaId"
			webClient.httpPost(url, postData).parseHtml()
		} else {
			val url = mangaUrl.toAbsoluteUrl(domain).removeSuffix('/') + "/ajax/chapters/"
			webClient.httpPost(url, emptyMap()).parseHtml()
		}
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return doc.select(selectChapter).mapChapters(reversed = true) { i, li ->
			val a = li.getElementsByTag("a").findWithText()
			val href = a?.attrAsRelativeUrlOrNull("href") ?: li.parseFailed("Link is missing")
			val link = href + stylePage
			val dateText = li.selectFirst("a.c-new-tag")?.attr("title") ?: li.selectFirst(selectDate)?.text()
			val name = a.text()
			MangaChapter(
				id = generateUid(href),
				url = link,
				name = name,
				number = 0f,
				volume = 0,
				branch = null,
				uploadDate = parseChapterDate(
					dateFormat,
					dateText,
				),
				scanlator = null,
				source = source,
			)
		}
	}

	private fun Elements.findWithText() = firstOrNull { it.hasText() } ?: first()
}
