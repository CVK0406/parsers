package org.example.dexreader.parsers.site.mangareader.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DOUJINDESURIP", "DoujinDesu.cfd", "id", ContentType.HENTAI)
internal class DoujinDesuRip(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.DOUJINDESURIP, "doujindesu.cfd", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
