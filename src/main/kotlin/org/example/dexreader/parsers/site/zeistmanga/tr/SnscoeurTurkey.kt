package org.example.dexreader.parsers.site.zeistmanga.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.model.MangaTag
import org.example.dexreader.parsers.site.zeistmanga.ZeistMangaParser
import org.example.dexreader.parsers.util.domain
import org.example.dexreader.parsers.util.mapNotNullToSet
import org.example.dexreader.parsers.util.parseHtml
import org.example.dexreader.parsers.util.selectFirstOrThrow

@MangaSourceParser("SNSCOEURTURKEY", "SnscoeurTurkey", "tr", ContentType.HENTAI)
internal class SnscoeurTurkey(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaSource.SNSCOEURTURKEY, "snscoeurturkey.blogspot.com") {
	override val sateOngoing: String = "Güncel"
	override val sateFinished: String = "Final"
	override val sateAbandoned: String = "Düzenleniyor"

	override val mangaCategory = "Seriler"

	override suspend fun getAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain/p/gelismis-arama.html").parseHtml()
		return doc.selectFirstOrThrow("div.filter").select("ul li").mapNotNullToSet {
			MangaTag(
				key = it.selectFirstOrThrow("input").attr("value"),
				title = it.selectFirstOrThrow("label").text(),
				source = source,
			)
		}
	}
}
