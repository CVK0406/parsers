package org.example.dexreader.parsers.site.zmanga.id

import org.jsoup.nodes.Document
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaChapter
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.zmanga.ZMangaParser
import org.example.dexreader.parsers.util.attrAsRelativeUrl
import org.example.dexreader.parsers.util.generateUid
import org.example.dexreader.parsers.util.mapChapters
import org.example.dexreader.parsers.util.selectFirstOrThrow
import java.text.SimpleDateFormat

// Info: Some scans are password-protected
@MangaSourceParser("MAID_ID", "MaidId", "id")
internal class MaidId(context: MangaLoaderContext) :
	ZMangaParser(context, MangaSource.MAID_ID, "www.maid.my.id") {

	override suspend fun getChapters(doc: Document): List<MangaChapter> {
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return doc.body().select(selectChapter).mapChapters(reversed = true) { i, li ->
			val a = li.selectFirstOrThrow("a")
			val href = a.attrAsRelativeUrl("href")
			val dateText = li.selectFirst(selectDate)?.text()
			val numChapter = li.selectFirstOrThrow(".flexch-infoz span").html().substringAfterLast("Chapter ")
				.substringBefore("<span")
			MangaChapter(
				id = generateUid(href),
				name = "Chapter $numChapter",
				number = i + 1,
				url = href,
				uploadDate = parseChapterDate(
					dateFormat,
					dateText,
				),
				source = source,
				scanlator = null,
				branch = null,
			)
		}
	}
}
