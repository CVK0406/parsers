package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("ZINMANGA", "ZinManga.com", "en")
internal class Zinmanga(context: MangaLoaderContext) : MadaraParser(context, MangaSource.ZINMANGA, "zinmanga.com") {
	override val datePattern = "MM/dd/yyyy"
}
