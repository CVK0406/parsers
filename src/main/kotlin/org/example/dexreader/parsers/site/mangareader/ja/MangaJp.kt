package org.example.dexreader.parsers.site.mangareader.ja

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser
import java.util.Locale

@MangaSourceParser("MANGAJP", "MangaJp", "ja")
internal class MangaJp(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MANGAJP, "mangajp.top", pageSize = 54, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val isTagsExclusionSupported = false
}
