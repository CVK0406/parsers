package org.example.dexreader.parsers.site.mangareader.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("KINGOFSHOJO", "KingOfShojo", "ar")
internal class KingOfShojo(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.KINGOFSHOJO, "kingofshojo.com", pageSize = 30, searchPageSize = 10)
