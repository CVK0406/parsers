package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("WEBTOON", "Webtoon.uk", "en")
internal class Webtoon(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.WEBTOON, "webtoon.uk", 20) {
	override val tagPrefix = "manhwa-genre/"
	override val postReq = true
}
