package org.example.dexreader.parsers.site.mangareader.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MERLINSCANS", "MerlinScans", "tr")
internal class MerlinScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MERLINSCANS, "merlinscans.com", pageSize = 25, searchPageSize = 20) {
	override val isTagsExclusionSupported = false
}
