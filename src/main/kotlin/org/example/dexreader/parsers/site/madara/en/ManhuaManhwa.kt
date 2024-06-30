package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHUAMANHWA", "ManhuaManhwa", "en")
internal class ManhuaManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANHUAMANHWA, "manhuamanhwa.com") {
	override val datePattern = "MM/dd/yyyy"
}
