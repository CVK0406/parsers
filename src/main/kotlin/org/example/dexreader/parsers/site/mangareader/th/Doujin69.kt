package org.example.dexreader.parsers.site.mangareader.th

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DOUJIN69", "Doujin69", "th", type = ContentType.HENTAI)
internal class Doujin69(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.DOUJIN69, "doujin69.com", pageSize = 40, searchPageSize = 21) {
	override val listUrl = "/doujin"
	override val isTagsExclusionSupported = false
}
