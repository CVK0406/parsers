package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("COLORED_MANGA", "ColoredManga", "en")
internal class ColoredManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.COLORED_MANGA, "coloredmanga.com") {
	override val datePattern = "dd-MMM"
}
