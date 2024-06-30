package org.example.dexreader.parsers.site.mangareader.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ELITON", "ThunderScans", "ar")
internal class Eliton(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.ELITON, "thunderscans.com", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
