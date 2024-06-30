package org.example.dexreader.parsers.site.zeistmanga.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("AIYUMANGASCANLATION", "AiyuManhua", "es")
internal class AiyuMangaScanlation(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaSource.AIYUMANGASCANLATION, "www.aiyumanhua.com") {
	override val selectPage = "article.chapter img"
}
