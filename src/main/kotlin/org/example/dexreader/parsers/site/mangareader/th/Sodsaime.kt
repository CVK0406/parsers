package org.example.dexreader.parsers.site.mangareader.th

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SODSAIME", "สดใสเมะ", "th")
internal class Sodsaime(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.SODSAIME, "www.xn--l3c0azab5a2gta.com", pageSize = 40, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
