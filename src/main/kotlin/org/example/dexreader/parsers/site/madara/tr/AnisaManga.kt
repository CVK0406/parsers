package org.example.dexreader.parsers.site.madara.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("ANISA_MANGA", "AnisaManga", "tr")
internal class AnisaManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.ANISA_MANGA, "anisamanga.com")
