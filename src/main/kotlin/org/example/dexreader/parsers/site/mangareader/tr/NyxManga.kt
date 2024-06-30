package org.example.dexreader.parsers.site.mangareader.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("NYXMANGA", "NyxManga", "tr")
internal class NyxManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.NYXMANGA, "nyxmanga.com", pageSize = 14, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}

