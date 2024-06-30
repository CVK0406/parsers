package org.example.dexreader.parsers.site.mangareader.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ENARESMANGA", "En-AresManga", "ar")
internal class EnAresManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.ENARESMANGA, "en-aresmanga.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/series"
	override val encodedSrc = true
	override val isTagsExclusionSupported = false
}
