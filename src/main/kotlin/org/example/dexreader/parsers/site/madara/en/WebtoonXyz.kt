package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("WEBTOONXYZ", "Webtoon.xyz", "en", ContentType.HENTAI)
internal class WebtoonXyz(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.WEBTOONXYZ, "www.webtoon.xyz", 20) {
	override val tagPrefix = "webtoon-genre/"
	override val listUrl = "read/"
	override val datePattern = "d MMM yyyy"
}
