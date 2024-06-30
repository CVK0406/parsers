package org.example.dexreader.parsers.site.zeistmanga.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("MANGAATREND", "MangaATrend", "ar")
internal class Mangaatrend(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaSource.MANGAATREND, "www.mangaatrend.net") {
	override val selectPage = "#seoneurons-target img"
}
