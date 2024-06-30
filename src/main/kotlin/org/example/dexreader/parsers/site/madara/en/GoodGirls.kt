package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("GOODGIRLS", "GoodGirls", "en")
internal class GoodGirls(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.GOODGIRLS, "goodgirls.moe", 10) {
	override val selectDesc = "div.post-content_item:contains(Synopsis) div.summary-content"
}
