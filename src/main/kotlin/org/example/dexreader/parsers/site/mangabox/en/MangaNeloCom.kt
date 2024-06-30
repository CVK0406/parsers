package org.example.dexreader.parsers.site.mangabox.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.config.ConfigKey
import org.example.dexreader.parsers.model.*
import org.example.dexreader.parsers.site.mangabox.MangaboxParser

@MangaSourceParser("MANGANELO_COM", "MangaNelo.com", "en")
internal class MangaNeloCom(context: MangaLoaderContext) :
	MangaboxParser(context, MangaSource.MANGANELO_COM) {
	override val configKeyDomain = ConfigKey.Domain("m.manganelo.com", "chapmanganelo.com")
	override val otherDomain = "chapmanganelo.com"
}
