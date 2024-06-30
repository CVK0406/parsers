package org.example.dexreader.parsers.site.madara.th

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("NEKOPOST", "NekoPost", "th")
internal class NekoPost(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.NEKOPOST, "www.nekopost.co") {
	override val postReq = true
	override val datePattern = "d MMMM yyyy"
}
