package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("ANSHSCANS", "AnshScans", "en")
internal class AnshScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.ANSHSCANS, "anshscans.org", 10) {
	override val tagPrefix = "genre/"
	override val datePattern = "MMMM dd, yyyy"
}
