package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("FAYSCANS", "FayScans", "pt")
internal class FayScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.FAYSCANS, "fayscans.net") {
	override val datePattern: String = "dd/MM/yyyy"
}
