package org.example.dexreader.parsers.site.madara.th

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("KINGS_MANGA", "KingsManga", "th")
internal class KingsManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.KINGS_MANGA, "www.kings-manga.co") {
	override val postReq = true
	override val datePattern = "d MMMM yyyy"
}
