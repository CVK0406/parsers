package org.example.dexreader.parsers.site.mangareader.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MILASUB", "MilaSub", "tr")
internal class MilaSub(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MILASUB, "www.milasub.com", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
