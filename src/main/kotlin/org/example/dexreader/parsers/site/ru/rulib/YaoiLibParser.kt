package org.example.dexreader.parsers.site.ru.rulib

import org.jsoup.nodes.Document
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.config.ConfigKey
import org.example.dexreader.parsers.model.MangaSource

@MangaSourceParser("YAOILIB", "YaoiLib", "ru")
internal class YaoiLibParser(context: MangaLoaderContext) : MangaLibParser(context, MangaSource.YAOILIB) {
	override val configKeyDomain = ConfigKey.Domain("yaoilib.me")
	override fun isNsfw(doc: Document) = true
}
