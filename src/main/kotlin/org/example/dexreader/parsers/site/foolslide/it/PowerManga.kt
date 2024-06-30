package org.example.dexreader.parsers.site.foolslide.it

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.foolslide.FoolSlideParser

@MangaSourceParser("POWERMANGA", "PowerManga", "it")
internal class PowerManga(context: MangaLoaderContext) :
	FoolSlideParser(context, MangaSource.POWERMANGA, "reader.powermanga.org") {
	override val pagination = false
}
