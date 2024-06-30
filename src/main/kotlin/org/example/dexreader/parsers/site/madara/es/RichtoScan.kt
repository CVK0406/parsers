package org.example.dexreader.parsers.site.madara.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser
import java.util.Locale

@MangaSourceParser("RICHTOSCAN", "RichtoScan", "es")
internal class RichtoScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.RICHTOSCAN, "richtoscan.com") {
	override val tagPrefix = "manga-generos/"
	override val sourceLocale: Locale = Locale.ENGLISH
}
