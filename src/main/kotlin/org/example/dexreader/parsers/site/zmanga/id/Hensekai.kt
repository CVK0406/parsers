package org.example.dexreader.parsers.site.zmanga.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.zmanga.ZMangaParser
import java.util.Locale

@MangaSourceParser("HENSEKAI", "Hensekai", "id", ContentType.HENTAI)
internal class Hensekai(context: MangaLoaderContext) :
	ZMangaParser(context, MangaSource.HENSEKAI, "hensekai.com") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
