package org.example.dexreader.parsers.site.ru.grouple

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.config.ConfigKey
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource

@MangaSourceParser("SELFMANGA", "SelfManga", "ru", type = ContentType.OTHER)
internal class SelfMangaParser(
	context: MangaLoaderContext,
) : GroupleParser(context, MangaSource.SELFMANGA, 3) {

	override val configKeyDomain = ConfigKey.Domain(*domains)

	companion object {

		val domains = arrayOf(
			"selfmanga.live",
		)
	}
}
