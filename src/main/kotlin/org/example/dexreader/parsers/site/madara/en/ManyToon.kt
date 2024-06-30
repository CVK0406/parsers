package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANYTOON", "ManyToon", "en", ContentType.HENTAI)
internal class ManyToon(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANYTOON, "manytoon.com", 20) {
	override val listUrl = "comic/"
}
