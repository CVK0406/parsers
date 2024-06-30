package org.example.dexreader.parsers.site.mangareader.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("MANGAYARO", "MangaYaro", "id")
internal class Mangayaro(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MANGAYARO, "www.mangayaro.id", pageSize = 20, searchPageSize = 20) {
	override val sourceLocale: Locale = Locale.ENGLISH
}
