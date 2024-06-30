package org.example.dexreader.parsers.site.zeistmanga.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("LONERTL", "LonerTranslations", "ar")
internal class LonerTl(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaSource.LONERTL, "loner-tl.blogspot.com") {
	override val sateOngoing: String = "مستمرة"
	override val sateFinished: String = "مكتملة"
	override val sateAbandoned: String = "متوقفة"
}
