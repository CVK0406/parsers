package org.example.dexreader.parsers.site.mangareader.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SUSHISCANFR", "Anime-Sama.me", "fr")
internal class SushiScanFR(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.SUSHISCANFR, "anime-sama.me", pageSize = 36, searchPageSize = 10)
