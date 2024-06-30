package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("SUSSYSCAN", "SussyScan", "pt")
internal class SussyScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.SUSSYSCAN, "sussyscan.com") {
	override val datePattern: String = "dd/MM/yyyy"
}
