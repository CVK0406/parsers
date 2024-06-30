package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ELARCPAGE", "ElarcPage", "en")
internal class Elarcpage(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.ELARCPAGE, "elarctoon.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/series"
}
