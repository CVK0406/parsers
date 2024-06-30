package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("FACTMANGA", "FactManga", "en")
internal class FactManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.FACTMANGA, "factmanga.com")
