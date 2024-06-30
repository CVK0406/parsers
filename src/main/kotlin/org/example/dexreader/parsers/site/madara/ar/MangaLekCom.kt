package org.example.dexreader.parsers.site.madara.ar

import org.jsoup.nodes.Document
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaChapter
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser
import org.example.dexreader.parsers.util.attrAsRelativeUrlOrNull
import org.example.dexreader.parsers.util.domain
import org.example.dexreader.parsers.util.generateUid
import org.example.dexreader.parsers.util.mapChapters
import org.example.dexreader.parsers.util.parseFailed
import org.example.dexreader.parsers.util.parseHtml
import java.text.SimpleDateFormat

@MangaSourceParser("MANGA_LEK", "Manga-Lek", "ar")
internal class MangaLekCom(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGA_LEK, "manga-lek.com") {
	override val listUrl = "mangalek/"
	override val postReq = true

	override suspend fun loadChapters(mangaUrl: String, document: Document): List<MangaChapter> {
		val mangaId = document.select("div#manga-chapters-holder").attr("data-id")
		val url = "https://$domain/wp-admin/admin-ajax.php"
		val postData = "action=manga_get_chapters&manga=$mangaId"
		val doc = webClient.httpPost(url, postData).parseHtml()
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return doc.select(selectChapter).mapChapters { i, li ->
			val a = li.selectFirst("a")
			val href = a?.attrAsRelativeUrlOrNull("href") ?: li.parseFailed("Link is missing")
			val link = href + stylePage
			val dateText = li.selectFirst("a.c-new-tag")?.attr("title") ?: li.selectFirst(selectDate)?.text()
			val name = a.selectFirst("p")?.text() ?: a.ownText()
			MangaChapter(
				id = generateUid(href),
				url = link,
				name = name,
				number = i + 1,
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
}
