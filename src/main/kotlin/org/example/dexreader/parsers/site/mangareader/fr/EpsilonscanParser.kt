package org.example.dexreader.parsers.site.mangareader.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("EPSILONSCAN", "EpsilonScan", "fr", ContentType.HENTAI)
internal class EpsilonscanParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.EPSILONSCAN, "epsilonscan.fr", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
