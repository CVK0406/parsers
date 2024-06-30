package org.example.dexreader.parsers.site.mangareader.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("FUTARI", "Futari", "id")
internal class Futari(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.FUTARI, "futari.info", pageSize = 25, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
