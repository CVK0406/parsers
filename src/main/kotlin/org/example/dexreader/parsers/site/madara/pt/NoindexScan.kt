package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("NOINDEXSCAN", "NoindexScan", "pt", ContentType.HENTAI)
internal class NoindexScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.NOINDEXSCAN, "noindexscan.com") {
	override val datePattern: String = "dd/MM/yyyy"
}
