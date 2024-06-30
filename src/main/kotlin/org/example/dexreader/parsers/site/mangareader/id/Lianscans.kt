package org.example.dexreader.parsers.site.mangareader.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("LIANSCANS", "LianScans", "id", ContentType.HENTAI)
internal class Lianscans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.LIANSCANS, "www.lianscans.my.id", pageSize = 10, searchPageSize = 10) {
	override val datePattern = "MMM d, yyyy"
}
