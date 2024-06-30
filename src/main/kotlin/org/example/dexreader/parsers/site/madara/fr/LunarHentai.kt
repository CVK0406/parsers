package org.example.dexreader.parsers.site.madara.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("LUNARHENTAI", "LunarHentai", "fr", ContentType.HENTAI)
internal class LunarHentai(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.LUNARHENTAI, "hentai.lunarscans.fr") {
	override val datePattern = "dd MMMM yyyy"
}
