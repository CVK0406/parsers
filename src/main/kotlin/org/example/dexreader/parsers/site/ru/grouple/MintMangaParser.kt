package org.example.dexreader.parsers.site.ru.grouple

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.config.ConfigKey
import org.example.dexreader.parsers.model.MangaSource

@MangaSourceParser("MINTMANGA", "MintManga", "ru")
internal class MintMangaParser(
	context: MangaLoaderContext,
) : GroupleParser(context, MangaSource.MINTMANGA, 2) {

	override val configKeyDomain = ConfigKey.Domain(*domains)

	companion object {

		val domains = arrayOf(
			"24.mintmanga.one",
			"mintmanga.live",
			"mintmanga.com",
		)
	}
}
