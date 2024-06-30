package org.example.dexreader.parsers.site.zeistmanga.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.model.MangaTag
import org.example.dexreader.parsers.site.zeistmanga.ZeistMangaParser
import org.example.dexreader.parsers.util.domain
import org.example.dexreader.parsers.util.mapNotNullToSet
import org.example.dexreader.parsers.util.parseHtml
import org.example.dexreader.parsers.util.requireElementById

@MangaSourceParser("GUILDATIERDRAW", "GuildaTierDraw", "pt")
internal class GuildaTierDraw(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaSource.GUILDATIERDRAW, "www.guildatierdraw.com") {

	override suspend fun getAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain").parseHtml()
		return doc.requireElementById("LinkList2").select("ul li a").mapNotNullToSet {
			MangaTag(
				key = it.attr("href").substringBefore("?").substringAfterLast('/'),
				title = it.text(),
				source = source,
			)
		}
	}
}
