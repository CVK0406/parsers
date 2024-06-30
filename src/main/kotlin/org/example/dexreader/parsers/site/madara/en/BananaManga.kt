package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("BANANA_MANGA", "BananaManga", "en")
internal class BananaManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.BANANA_MANGA, "bananamanga.net", 20)
