package org.example.dexreader.parsers.site.mangareader.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("RAGNASCAN", "RagnaScan", "es")
internal class RagnaScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.RAGNASCAN, "ragnascan.com", pageSize = 5, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
