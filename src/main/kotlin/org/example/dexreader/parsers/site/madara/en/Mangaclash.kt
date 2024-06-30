package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGACLASH", "MangaClash", "en")
internal class Mangaclash(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGACLASH, "mangaclash.com", pageSize = 18) {
	override val datePattern = "MM/dd/yyyy"
}
