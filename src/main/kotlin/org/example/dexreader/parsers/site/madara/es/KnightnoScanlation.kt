package org.example.dexreader.parsers.site.madara.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("KNIGHTNOSCANLATION", "Knightno Scanlation", "es")
internal class KnightnoScanlation(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.KNIGHTNOSCANLATION, "knightnoscanlation.com") {
	override val listUrl = "sr/"
	override val tagPrefix = "generos/"
}
