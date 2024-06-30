package org.example.dexreader.parsers.site.mmrcms.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mmrcms.MmrcmsParser
import java.util.Locale

@MangaSourceParser("MANGAID", "MangaId", "id")
internal class Mangaid(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaSource.MANGAID, "mangaid.click") {
	override val selectState = "dt:contains(Status)"
	override val selectAlt = "dt:contains(Other names)"
	override val selectAut = "dt:contains(Author(s))"
	override val selectTag = "dt:contains(Categories)"
	override val sourceLocale: Locale = Locale.ENGLISH
}
