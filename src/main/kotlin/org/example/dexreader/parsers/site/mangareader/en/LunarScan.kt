package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("LUNAR_SCAN", "LunarScan.org", "en", ContentType.HENTAI)
internal class LunarScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.LUNAR_SCAN, "lunarscan.org", pageSize = 20, searchPageSize = 20) {
	override val listUrl = "/series"
	override val isTagsExclusionSupported = false
}
