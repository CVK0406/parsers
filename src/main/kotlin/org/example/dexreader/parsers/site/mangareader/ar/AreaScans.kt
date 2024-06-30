package org.example.dexreader.parsers.site.mangareader.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("AREASCANS", "AreaScans", "ar")
internal class AreaScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.AREASCANS, "www.areascans.net", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
