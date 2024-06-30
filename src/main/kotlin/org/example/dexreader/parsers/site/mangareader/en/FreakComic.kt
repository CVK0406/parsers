package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("FREAKCOMIC", "FreakComic", "en")
internal class FreakComic(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.FREAKCOMIC, "freakcomic.com", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
