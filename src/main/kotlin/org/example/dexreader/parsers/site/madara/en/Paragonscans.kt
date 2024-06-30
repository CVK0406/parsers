package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("PARAGONSCANS", "ParagonScans", "en")
internal class Paragonscans(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.PARAGONSCANS, "paragonscans.com", pageSize = 50) {
	override val datePattern = "MM/dd/yyyy"
}
