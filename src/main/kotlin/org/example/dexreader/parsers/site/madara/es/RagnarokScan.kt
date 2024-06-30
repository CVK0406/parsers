package org.example.dexreader.parsers.site.madara.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("RAGNAROKSCAN", "RagnarokScan", "es")
internal class RagnarokScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.RAGNAROKSCAN, "ragnarokscan.com") {
	override val stylePage = ""
	override val listUrl = "series/"
	override val tagPrefix = "genero/"
}
