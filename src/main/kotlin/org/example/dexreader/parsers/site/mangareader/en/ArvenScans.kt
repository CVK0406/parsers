package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ARVENSCANS", "ArvenScans", "en")
internal class ArvenScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.ARVENSCANS, "arvenscans.org", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/series"
}
