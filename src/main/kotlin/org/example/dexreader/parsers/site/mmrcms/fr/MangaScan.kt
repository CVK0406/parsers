package org.example.dexreader.parsers.site.mmrcms.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mmrcms.MmrcmsParser
import java.util.Locale

@MangaSourceParser("MANGA_SCAN", "MangaScan", "fr")
internal class MangaScan(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaSource.MANGA_SCAN, "mangascan-fr.com") {
	override val imgUpdated = ".jpg"
	override val sourceLocale: Locale = Locale.ENGLISH
}
