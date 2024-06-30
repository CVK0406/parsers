package org.example.dexreader.parsers.site.zeistmanga.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("ELEVENSCANLATOR", "ElevenScanlator", "pt")
internal class ElevenScanlator(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaSource.ELEVENSCANLATOR, "elevenscanlator.blogspot.com") {
	override val sateOngoing: String = "Lançando"
	override val sateFinished: String = "Completo"
	override val sateAbandoned: String = "Dropado"
}
