package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("LUMINOUSSCANS", "LuminousScans", "en")
internal class LuminousScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.LUMINOUSSCANS, "lumitoon.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/series"
	override val isTagsExclusionSupported = false
}
