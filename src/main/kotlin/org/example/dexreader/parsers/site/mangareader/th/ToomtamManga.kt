package org.example.dexreader.parsers.site.mangareader.th

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("TOOMTAMMANGA", "ToomtamManga", "th", ContentType.HENTAI)
internal class ToomtamManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.TOOMTAMMANGA, "toomtam-manga.com", pageSize = 30, searchPageSize = 28) {
	override val isTagsExclusionSupported = false
}
