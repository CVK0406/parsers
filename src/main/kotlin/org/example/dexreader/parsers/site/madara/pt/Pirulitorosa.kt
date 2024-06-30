package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("PIRULITOROSA", "PirulitoRosa", "pt", ContentType.HENTAI)
internal class Pirulitorosa(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.PIRULITOROSA, "pirulitorosa.site") {
	override val postReq = true
	override val datePattern: String = "dd/MM/yyyy"
}
