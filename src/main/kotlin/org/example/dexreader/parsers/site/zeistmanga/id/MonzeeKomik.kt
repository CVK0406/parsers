package org.example.dexreader.parsers.site.zeistmanga.id

import org.jsoup.nodes.Document
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaChapter
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.zeistmanga.ZeistMangaParser
import org.example.dexreader.parsers.util.domain
import org.example.dexreader.parsers.util.generateUid
import org.example.dexreader.parsers.util.json.toJSONList
import org.example.dexreader.parsers.util.parseJson
import org.example.dexreader.parsers.util.selectFirstOrThrow
import org.example.dexreader.parsers.util.tryParse
import java.text.SimpleDateFormat

@MangaSourceParser("MONZEEKOMIK", "MonzeeKomik", "id")
internal class MonzeeKomik(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaSource.MONZEEKOMIK, "www.monzeekomik.my.id") {
	override val selectPage = "article#reader img"

	override suspend fun loadChapters(mangaUrl: String, doc: Document): List<MangaChapter> {


		val chapterRegex = """clwd\.run\('([^']+)'""".toRegex()
		val scriptSelector = "#clwd > script"
		val script = doc.selectFirstOrThrow(scriptSelector)
		val feedFind = chapterRegex
			.find(script.html())
			?.groupValues?.get(1)
			?: throw Exception("Failed to find chapter feed")

		val feedClean = feedFind.removeSuffix(")") // clean

		val feed = if (feedClean == "Reincarnation Colosseum") // hot fix
		{
			"I Have 90 Billion Licking Gold"
		} else {
			feedClean
		}

		val url = buildString {
			append("https://")
			append(domain)
			append("/feeds/posts/default/-/")
			append(feed)
			append("?alt=json&orderby=published&max-results=9999")
		}
		val json =
			webClient.httpGet(url).parseJson().getJSONObject("feed").getJSONArray("entry").toJSONList().reversed()
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return json.mapIndexedNotNull { i, j ->
			val name = j.getJSONObject("title").getString("\$t")
			val href =
				j.getJSONArray("link").toJSONList().first { it.getString("rel") == "alternate" }.getString("href")
			val dateText = j.getJSONObject("published").getString("\$t").substringBefore("T")
			val slug = mangaUrl.substringAfterLast('/')
			val slugChapter = href.substringAfterLast('/')
			if (slug == slugChapter) {
				return@mapIndexedNotNull null
			}
			MangaChapter(
				id = generateUid(href),
				url = href,
				name = name,
				number = i + 1,
				branch = null,
				uploadDate = dateFormat.tryParse(dateText),
				scanlator = null,
				source = source,
			)
		}
	}
}
