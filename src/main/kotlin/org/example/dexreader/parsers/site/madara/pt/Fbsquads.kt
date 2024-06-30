package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("FBSQUADS", "FbSquads", "pt", ContentType.HENTAI)
internal class Fbsquads(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.FBSQUADS, "fbsquads.com") {
	override val datePattern: String = "dd/MM/yyyy"
}
