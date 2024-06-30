package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("LILYMANGA", "LilyManga", "en", ContentType.HENTAI)
internal class LilyManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.LILYMANGA, "lilymanga.net") {
	override val tagPrefix = "ys-genre/"
	override val listUrl = "ys/"
	override val datePattern = "yyyy-MM-dd"
}
