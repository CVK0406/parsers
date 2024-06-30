package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("ADULT_WEBTOON", "AdultWebtoon", "en", ContentType.HENTAI)
internal class AdultWebtoon(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.ADULT_WEBTOON, "adultwebtoon.com") {
	override val tagPrefix = "adult-webtoon-genre/"
	override val postReq = true
}
