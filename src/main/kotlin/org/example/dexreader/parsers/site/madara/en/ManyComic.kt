package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANYCOMIC", "ManyComic", "en", ContentType.HENTAI)
internal class ManyComic(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANYCOMIC, "manycomic.com") {
	override val postReq = true
	override val tagPrefix = "comic-genre/"
}
