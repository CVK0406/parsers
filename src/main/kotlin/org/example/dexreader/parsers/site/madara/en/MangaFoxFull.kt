package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAFOXFULL", "MangaFoxFull", "en")
internal class MangaFoxFull(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGAFOXFULL, "mangafoxfull.com") {
	override val postReq = true
}
