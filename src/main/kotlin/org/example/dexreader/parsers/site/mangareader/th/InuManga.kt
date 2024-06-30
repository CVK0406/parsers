package org.example.dexreader.parsers.site.mangareader.th

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("INUMANGA", "InuManga", "th")
internal class InuManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.INUMANGA, "www.inu-manga.com", pageSize = 40, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
