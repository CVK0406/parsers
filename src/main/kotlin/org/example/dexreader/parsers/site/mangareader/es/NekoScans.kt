package org.example.dexreader.parsers.site.mangareader.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("NEKOSCANS", "NekoScans", "es")
internal class NekoScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.NEKOSCANS, "nekoscans.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/proyecto"
	override val encodedSrc = true
	override val isTagsExclusionSupported = false
}
