package org.example.dexreader.parsers.site.mangareader.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("TAROTSCANS", "TarotScans", "tr")
internal class TarotScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.TAROTSCANS, "www.tarotscans.com", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}

