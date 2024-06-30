package org.example.dexreader.parsers.site.madara.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGA_CRAB", "MangaCrab", "es")
internal class MangaCrab(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGA_CRAB, "httpmangacrab2.com") {
	override val datePattern = "dd/MM/yyyy"
	override val tagPrefix = "manga-genero/"
	override val listUrl = "series/"
	override val selectChapter = "div.listing-chapters_wrap > ul > li"
	override val selectDesc = "div.c-page__content div.modal-contenido p"
	override val selectState = "div.summary-content2"
}
