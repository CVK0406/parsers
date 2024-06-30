package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("YURILIVE", "YuriLive", "pt", ContentType.HENTAI)
internal class YuriLive(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.YURILIVE, "yuri.live") {
	override val tagPrefix = "manga-genero/"
	override val datePattern: String = "dd/MM/yyyy"
}
