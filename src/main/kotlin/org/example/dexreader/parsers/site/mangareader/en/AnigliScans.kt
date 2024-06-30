package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ANIGLISCANS", "AnigliScans", "en")
internal class AnigliScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.ANIGLISCANS, "anigliscans.xyz", pageSize = 47, searchPageSize = 47) {
	override val listUrl = "/series"
	override val isTagsExclusionSupported = false
}
