package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("LADYESTELARSCAN", "LadyEstelarScan", "pt")
internal class LadyestelarScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.LADYESTELARSCAN, "ladyestelarscan.com.br", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
