package org.example.dexreader.parsers.site.mangareader.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("PHENIXSCANS", "PhenixScans", "fr")
internal class PhenixscansParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.PHENIXSCANS, "phenixscans.fr", pageSize = 20, searchPageSize = 10) {
	override val datePattern = "MMM d, yyyy"
	override val isTagsExclusionSupported = false
}
