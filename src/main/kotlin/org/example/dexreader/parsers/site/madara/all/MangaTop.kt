package org.example.dexreader.parsers.site.madara.all

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("MANGATOP", "MangaTop", "", ContentType.HENTAI)
internal class MangaTop(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGATOP, "mangatop.site") {
	override val datePattern = "d MMMM yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val stylePage = ""
}
