package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SURYASCANS", "SuryaScans", "en")
internal class SuryaScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.SURYASCANS, "suryacomics.com", pageSize = 5, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
