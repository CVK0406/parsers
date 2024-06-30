package org.example.dexreader.parsers.site.mmrcms.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mmrcms.MmrcmsParser
import java.util.Locale

@MangaSourceParser("LELSCANVF", "LelScanVf", "fr")
internal class LelScanVf(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaSource.LELSCANVF, "lelscanvf.cc") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
