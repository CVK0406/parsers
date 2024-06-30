package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("CABAREDOWATAME", "DessertScan", "pt")
internal class Cabaredowatame(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.CABAREDOWATAME, "cabaredowatame.site", 10) {
	override val datePattern = "dd/MM/yyyy"
}
