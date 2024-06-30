package org.example.dexreader.parsers.site.mangareader.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("KATAKOMIK", "KataKomik", "id")
internal class KataKomik(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.KATAKOMIK, "katakomik.my.id", pageSize = 20, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val isTagsExclusionSupported = false
}
