package org.example.dexreader.parsers.site.mangareader.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("BEASTSCANS", "BeastScans", "ar")
internal class BeastScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.BEASTSCANS, "beastscans.net", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
