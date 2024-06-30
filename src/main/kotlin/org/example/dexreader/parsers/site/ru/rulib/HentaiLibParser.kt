package org.example.dexreader.parsers.site.ru.rulib

import org.jsoup.nodes.Document
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.config.ConfigKey
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource

@MangaSourceParser("HENTAILIB", "HentaiLib", "ru", type = ContentType.HENTAI)
internal class HentaiLibParser(context: MangaLoaderContext) : MangaLibParser(context, MangaSource.HENTAILIB) {
	override val configKeyDomain = ConfigKey.Domain("hentailib.me")
	override fun isNsfw(doc: Document) = true
}
