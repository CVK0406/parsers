package org.example.dexreader.parsers.site.mmrcms.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mmrcms.MmrcmsParser
import java.util.Locale

@MangaSourceParser("SCANMANGA", "ScanManga", "fr")
internal class ScanManga(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaSource.SCANMANGA, "scan-manga.me") {
	override val imgUpdated = ".jpg"
	override val sourceLocale: Locale = Locale.ENGLISH
}
