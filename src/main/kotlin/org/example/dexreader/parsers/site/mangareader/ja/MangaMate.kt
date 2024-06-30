package org.example.dexreader.parsers.site.mangareader.ja

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser
import java.util.Locale

@MangaSourceParser("MANGAMATE", "MangaMate", "ja")
internal class MangaMate(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MANGAMATE, "manga-mate.org", pageSize = 10, searchPageSize = 10) {
	override val datePattern = "M月 d, yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val isTagsExclusionSupported = false
}
