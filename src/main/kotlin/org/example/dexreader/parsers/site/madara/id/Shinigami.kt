package org.example.dexreader.parsers.site.madara.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.config.ConfigKey
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.network.UserAgents
import org.example.dexreader.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("SHINIGAMI", "Shinigami", "id")
internal class Shinigami(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.SHINIGAMI, "shinigamitoon.com", 10) {

	private val userAgentKey = ConfigKey.UserAgent(context.getDefaultUserAgent())
	override val tagPrefix = "genre/"
	override val listUrl = "series/"
	override val sourceLocale: Locale = Locale.ENGLISH

	override fun onCreateConfig(keys: MutableCollection<ConfigKey<*>>) {
		super.onCreateConfig(keys)
		keys.add(userAgentKey)
	}

}
