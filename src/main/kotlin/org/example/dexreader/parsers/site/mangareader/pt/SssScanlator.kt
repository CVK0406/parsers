package org.example.dexreader.parsers.site.mangareader.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SSSSCANLATOR", "SssScanlator", "pt")
internal class SssScanlator(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.SSSSCANLATOR, "sssscanlator.com.br", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
