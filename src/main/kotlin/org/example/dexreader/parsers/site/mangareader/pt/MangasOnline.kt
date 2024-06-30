package org.example.dexreader.parsers.site.mangareader.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGASONLINE", "MangasOnline", "pt")
internal class MangasOnline(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MANGASONLINE, "mangasonline.cc", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
