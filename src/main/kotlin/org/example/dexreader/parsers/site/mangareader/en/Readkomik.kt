package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("READKOMIK", "ReadKomik", "en")
internal class Readkomik(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.READKOMIK, "readkomik.com", pageSize = 20, searchPageSize = 20) {
	override val datePattern = "MMM d, yyyy"
	override val isTagsExclusionSupported = false
}

