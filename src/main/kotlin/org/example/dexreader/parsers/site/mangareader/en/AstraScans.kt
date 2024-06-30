package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ASTRASCANS", "AstraScans", "en")
internal class AstraScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.ASTRASCANS, "astrascans.com", pageSize = 30, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
