package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("ASTRUMSCANS", "AstrumScans", "pt")
internal class AstrumScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.ASTRUMSCANS, "astrumscans.xyz", 20) {
	override val withoutAjax = true
	override val listUrl = "series/"
	override val datePattern = "dd/MM/yyyy"
}
