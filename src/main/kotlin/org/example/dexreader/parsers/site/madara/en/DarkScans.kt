package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("DARK_SCANS", "DarkScans", "en")
internal class DarkScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.DARK_SCANS, "darkscans.com", 18) {
	override val listUrl = "mangas/"
	override val tagPrefix = "mangas-genre/"
}
