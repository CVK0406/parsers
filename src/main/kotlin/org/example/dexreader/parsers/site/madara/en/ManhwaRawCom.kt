package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWARAW_COM", "ManhwaRaw.com", "en", ContentType.HENTAI)
internal class ManhwaRawCom(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANHWARAW_COM, "manhwaraw.com") {
	override val postReq = true
	override val listUrl = "manhwa-raw/"
	override val tagPrefix = "manhwa-raw-genre/"
}
