package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("DRAKESCANS", "DrakeScans", "en")
internal class DrakeScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.DRAKESCANS, "drakescans.com", 10) {
	override val datePattern = "dd/MM/yyyy"
	override val tagPrefix = "series-genre/"
	override val listUrl = "series/"
}
