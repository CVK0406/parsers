package org.example.dexreader.parsers.site.zeistmanga.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.model.MangaTag
import org.example.dexreader.parsers.site.zeistmanga.ZeistMangaParser
import org.example.dexreader.parsers.util.domain
import org.example.dexreader.parsers.util.mapNotNullToSet
import org.example.dexreader.parsers.util.parseHtml
import org.example.dexreader.parsers.util.requireElementById
import org.example.dexreader.parsers.util.selectFirstOrThrow

@MangaSourceParser("MIKOROKU", "Mikoroku", "id", ContentType.HENTAI)
internal class Mikoroku(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaSource.MIKOROKU, "www.mikoroku.web.id") {

	override suspend fun getAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain").parseHtml()
		return doc.requireElementById("Genre").select("div.items-center").mapNotNullToSet {
			MangaTag(
				key = it.selectFirstOrThrow("input").attr("value"),
				title = it.selectFirstOrThrow("label").text().substringBefore('('),
				source = source,
			)
		}
	}
}
