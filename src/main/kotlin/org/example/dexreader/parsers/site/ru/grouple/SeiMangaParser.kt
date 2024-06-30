package org.example.dexreader.parsers.site.ru.grouple

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.config.ConfigKey
import org.example.dexreader.parsers.model.MangaSource

@MangaSourceParser("SEIMANGA", "SeiManga", "ru")
internal class SeiMangaParser(
	context: MangaLoaderContext,
) : GroupleParser(context, MangaSource.SEIMANGA, 21) {

	override val configKeyDomain = ConfigKey.Domain(*domains)

	companion object {

		val domains = arrayOf(
			"seimanga.me",
		)
	}
}
