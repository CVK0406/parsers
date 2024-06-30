package org.example.dexreader.parsers.site.mangareader.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGAOKUTR", "MangaOku Tr", "tr")
internal class Mangaokutr(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MANGAOKUTR, "mangaokutr.com", pageSize = 25, searchPageSize = 20)
