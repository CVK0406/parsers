package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("VOIDSCANS", "VoidScans", "en")
internal class VoidScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.VOIDSCANS, "void-scans.com", pageSize = 150, searchPageSize = 150) {
	override val datePattern = "MMM d, yyyy"
	override val isTagsExclusionSupported = false
}
