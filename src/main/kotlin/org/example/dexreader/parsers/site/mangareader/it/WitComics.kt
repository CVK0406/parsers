package org.example.dexreader.parsers.site.mangareader.it

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("WITCOMICS", "WitComics", "it")
internal class WitComics(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.WITCOMICS, "www.witcomics.net", pageSize = 5, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
