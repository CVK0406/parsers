package org.example.dexreader.parsers.site.mangareader.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser
import java.util.Locale

@MangaSourceParser("NOROMAX", "Noromax", "id")
internal class Noromax(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.NOROMAX, "noromax.my.id", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/Komik"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val isTagsExclusionSupported = false
}
