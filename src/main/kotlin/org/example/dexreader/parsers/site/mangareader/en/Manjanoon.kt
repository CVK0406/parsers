package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANJANOON_EN", "Manjanoon.net", "en")
internal class Manjanoon(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MANJANOON_EN, "manjanoon.net", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
