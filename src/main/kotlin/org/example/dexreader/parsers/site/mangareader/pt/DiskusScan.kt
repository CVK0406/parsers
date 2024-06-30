package org.example.dexreader.parsers.site.mangareader.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DISKUSSCAN", "DiskusScan", "pt")
internal class DiskusScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.DISKUSSCAN, "diskusscan.com", pageSize = 20, searchPageSize = 10)
