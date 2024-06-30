package org.example.dexreader.parsers.site.mangareader.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("HIKARISCAN", "HikariScan", "pt")
internal class HikariScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.HIKARISCAN, "hikariscan.org", pageSize = 20, searchPageSize = 10)
