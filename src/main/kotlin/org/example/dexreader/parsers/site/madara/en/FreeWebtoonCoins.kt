package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("FREEWEBTOONCOINS", "FreeWebtoonCoins", "en")
internal class FreeWebtoonCoins(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.FREEWEBTOONCOINS, "freewebtooncoins.com") {
	override val tagPrefix = "webtoon-genre/"
	override val listUrl = "webtoon/"
}
