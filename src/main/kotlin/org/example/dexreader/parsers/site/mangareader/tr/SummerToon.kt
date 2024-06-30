package org.example.dexreader.parsers.site.mangareader.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SUMMERTOON", "SummerToon", "tr")
internal class SummerToon(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.SUMMERTOON, "summertoon.net", pageSize = 10, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}

