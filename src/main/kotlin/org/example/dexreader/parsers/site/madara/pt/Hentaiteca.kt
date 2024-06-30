package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("HENTAITECA", "Hentaiteca", "pt", ContentType.HENTAI)
internal class Hentaiteca(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.HENTAITECA, "hentaiteca.net", pageSize = 10) {
	override val datePattern = "MM/dd/yyyy"
	override val tagPrefix = "genero/"
}
