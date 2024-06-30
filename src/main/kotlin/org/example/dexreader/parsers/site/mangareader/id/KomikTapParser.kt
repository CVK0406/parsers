package org.example.dexreader.parsers.site.mangareader.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser
import java.util.Locale

@MangaSourceParser("KOMIKTAP", "KomikTap", "id")
internal class KomikTapParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.KOMIKTAP, "komiktap.me", pageSize = 25, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val isTagsExclusionSupported = false
}
