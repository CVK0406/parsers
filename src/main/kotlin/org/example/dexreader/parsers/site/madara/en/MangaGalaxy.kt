package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAGALAXY", "MangaGalaxy", "en")
internal class MangaGalaxy(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGAGALAXY, "mangagalaxy.me", 16) {

	override val datePattern = "MM/dd/yyyy"
}
