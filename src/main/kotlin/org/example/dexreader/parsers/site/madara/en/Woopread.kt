package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("WOOPREAD", "Woopread", "en")
internal class Woopread(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.WOOPREAD, "woopread.com", 10) {
	override val listUrl = "series/"
	override val tagPrefix = "series-genres/"
}
