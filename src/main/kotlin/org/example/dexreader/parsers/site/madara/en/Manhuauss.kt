package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHUAUSS", "Manhuauss", "en")
internal class Manhuauss(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANHUAUSS, "manhuauss.com") {
	override val withoutAjax = true
}
