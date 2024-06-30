package org.example.dexreader.parsers.site.mangareader.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MIAUSCAN", "MiauScan", "es")
internal class MiauScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MIAUSCAN, "miaucomics.org", pageSize = 20, searchPageSize = 10)
