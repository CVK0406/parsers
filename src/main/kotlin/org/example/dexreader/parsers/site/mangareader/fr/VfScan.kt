package org.example.dexreader.parsers.site.mangareader.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("VFSCAN", "VfScan", "fr")
internal class VfScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.VFSCAN, "www.vfscan.cc", pageSize = 18, searchPageSize = 18) {
	override val isTagsExclusionSupported = false
}
