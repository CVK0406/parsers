package org.example.dexreader.parsers.site.mmrcms.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mmrcms.MmrcmsParser
import java.util.Locale

@MangaSourceParser("MANGA_DENIZI", "MangaDenizi", "tr")
internal class MangaDenizi(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaSource.MANGA_DENIZI, "www.mangadenizi.net") {
	override val selectState = "dt:contains(Durum)"
	override val selectAlt = "dt:contains(Diğer Adları)"
	override val selectAut = "dt:contains(Yazar & Çizer)"
	override val selectTag = "dt:contains(Kategoriler)"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val datePattern = "dd.MM.yyyy"
}
