package org.example.dexreader.parsers.site.madara.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("INFRAFANDUB", "InfraFandub", "es")
internal class Infrafandub(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.INFRAFANDUB, "infrafandub.com", 10) {
	override val datePattern = "dd/MM/yyyy"
}
