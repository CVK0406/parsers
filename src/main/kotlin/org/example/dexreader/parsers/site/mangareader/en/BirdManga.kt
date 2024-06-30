package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("BIRDMANGA", "BirdManga", "en")
internal class BirdManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.BIRDMANGA, "birdmanga.com", pageSize = 20, searchPageSize = 10) {
	override val encodedSrc = true
	override val isTagsExclusionSupported = false
}
