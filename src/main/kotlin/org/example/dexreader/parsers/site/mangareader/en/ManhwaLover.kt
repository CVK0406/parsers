package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANHWALOVER", "ManhwaLover", "en", ContentType.HENTAI)
internal class ManhwaLover(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MANHWALOVER, "www.manhwalover.com", pageSize = 20, searchPageSize = 20) {
	override val datePattern = "MMM d, yyyy"
	override val isTagsExclusionSupported = false
}
