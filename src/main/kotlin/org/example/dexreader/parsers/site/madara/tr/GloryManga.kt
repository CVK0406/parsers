package org.example.dexreader.parsers.site.madara.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("GLORYMANGA", "GloryManga", "tr")
internal class GloryManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.GLORYMANGA, "glorymanga.com", 18) {
	override val datePattern = "dd/MM/yyyy"
}
