package org.example.dexreader.parsers.site.mangareader.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("KINGOFMANGA", "KingOfManga", "ar")
internal class KingOfManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.KINGOFMANGA, "kingofmanga.com", pageSize = 30, searchPageSize = 10)
