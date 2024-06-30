package org.example.dexreader.parsers.site.madara.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGA_SCANTRAD", "MangaScantrad.io", "fr")
internal class MangaScantrad(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGA_SCANTRAD, "manga-scantrad.io") {
	override val datePattern = "d MMMM yyyy"
}
