package org.example.dexreader.parsers.site.mangareader.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("MANHWAINDO", "ManhwaIndo.id", "id")
internal class ManhwaIndoParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MANHWAINDO, "manhwaindo.id", pageSize = 30, searchPageSize = 10) {
	override val datePattern = "MMMM dd, yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val listUrl = "/series"
}
