package org.example.dexreader.parsers.site.mangareader.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DOJING", "Dojing", "id", ContentType.HENTAI)
internal class Dojing(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.DOJING, "dojing.net", pageSize = 12, searchPageSize = 12) {
	override val datePattern = "MMM d, yyyy"
	override val isTagsExclusionSupported = false
}
