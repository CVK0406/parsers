package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("FREECOMICONLINE", "FreeComicOnline", "en", ContentType.HENTAI)
internal class FreeComicOnline(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.FREECOMICONLINE, "freecomiconline.me") {
	override val postReq = true
	override val listUrl = "comic/"
	override val tagPrefix = "comic-genre/"
}
