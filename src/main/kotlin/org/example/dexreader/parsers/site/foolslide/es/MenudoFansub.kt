package org.example.dexreader.parsers.site.foolslide.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.foolslide.FoolSlideParser

@MangaSourceParser("MENUDO_FANSUB", "Menudo Fansub", "es")
internal class MenudoFansub(context: MangaLoaderContext) :
	FoolSlideParser(context, MangaSource.MENUDO_FANSUB, "www.menudo-fansub.com", 25) {
	override val searchUrl = "slide/search/"
	override val listUrl = "slide/directory/"
}
