package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("NEROXUS", "Neroxus", "pt")
internal class Neroxus(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.NEROXUS, "neroxus.com.br", 10) {
	override val datePattern = "MMM d, yyyy"
}
