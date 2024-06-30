package org.example.dexreader.parsers.site.ru.grouple

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.config.ConfigKey
import org.example.dexreader.parsers.model.MangaSource

@MangaSourceParser("READMANGA_RU", "ReadManga", "ru")
internal class ReadmangaParser(
	context: MangaLoaderContext,
) : GroupleParser(context, MangaSource.READMANGA_RU, 1) {

	override val configKeyDomain = ConfigKey.Domain(*domains)

	companion object {

		val domains = arrayOf(
			"readmanga.live",
			"readmanga.io",
			"readmanga.me",
		)
	}
}
