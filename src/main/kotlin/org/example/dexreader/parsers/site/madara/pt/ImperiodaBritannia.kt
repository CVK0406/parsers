package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("IMPERIODABRITANNIA", "ImperioDaBritannia", "pt")
internal class ImperiodaBritannia(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.IMPERIODABRITANNIA, "imperiodabritannia.com", 10) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
	override val withoutAjax = true
}
