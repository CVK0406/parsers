package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ASURASCANS", "AsuraScans", "en")
internal class AsuraScansParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.ASURASCANS, "asuratoon.com", pageSize = 20, searchPageSize = 10) {
	override val selectPage = "#readerarea img:not(.asurascans)"
	override val selectTestScript = "force html"
	override val isTagsExclusionSupported = false
}
