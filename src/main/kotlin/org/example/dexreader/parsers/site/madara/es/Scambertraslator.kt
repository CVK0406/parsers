package org.example.dexreader.parsers.site.madara.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("SCAMBERTRASLATOR", "ScamberTraslator", "es")
internal class Scambertraslator(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.SCAMBERTRASLATOR, "scambertraslator.com") {
	override val datePattern = "dd/MM/yyyy"
}
