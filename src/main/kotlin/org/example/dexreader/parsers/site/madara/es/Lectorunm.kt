package org.example.dexreader.parsers.site.madara.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("LECTORUNM", "Lectorunm.life", "es")
internal class Lectorunm(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.LECTORUNM, "lectorunm.life") {
	override val datePattern = "dd/MM/yyyy"
}
