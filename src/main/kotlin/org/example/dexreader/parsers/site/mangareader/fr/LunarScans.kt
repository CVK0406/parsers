package org.example.dexreader.parsers.site.mangareader.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("LUNARSCANS", "LunarScans", "fr")
internal class LunarScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.LUNARSCANS, "lunarscans.fr", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
