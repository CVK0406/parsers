package org.example.dexreader.parsers.site.mangabox.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.config.ConfigKey
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangabox.MangaboxParser

@MangaSourceParser("MANGANATO", "Manganato", "en")
internal class Manganato(context: MangaLoaderContext) :
	MangaboxParser(context, MangaSource.MANGANATO) {
	override val configKeyDomain = ConfigKey.Domain(
		"manganato.com",
		"chapmanganato.to",
		"chapmanganato.com",
	)
	override val otherDomain = configKeyDomain.defaultValue
}
