package org.example.dexreader.parsers.site.mangareader.it

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("WALPURGISCAN", "WalpurgiScan", "it")
internal class Walpurgiscan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.WALPURGISCAN, "www.walpurgiscan.it", pageSize = 20, searchPageSize = 20) {
	override val datePattern = "MMM d, yyyy"
	override val isTagsExclusionSupported = false
}
