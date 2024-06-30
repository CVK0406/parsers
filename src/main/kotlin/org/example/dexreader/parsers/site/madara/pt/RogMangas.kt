package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("ROGMANGAS", "RogMangas", "pt")
internal class RogMangas(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.ROGMANGAS, "rogmangas.com", 51) {
	override val datePattern: String = "dd/MM/yyyy"
}
