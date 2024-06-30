package org.example.dexreader.parsers.site.foolslide.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.foolslide.FoolSlideParser

@MangaSourceParser("HNISCANTRAD", "HniScantrad", "fr")
internal class HniScantrad(context: MangaLoaderContext) :
	FoolSlideParser(context, MangaSource.HNISCANTRAD, "hni-scantrad.com") {
	override val pagination = false
	override val searchUrl = "lel/search/"
	override val listUrl = "lel/directory/"
}
