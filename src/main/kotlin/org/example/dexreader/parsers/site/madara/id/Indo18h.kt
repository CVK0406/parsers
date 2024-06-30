package org.example.dexreader.parsers.site.madara.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("INDO18H", "Indo18h", "id", ContentType.HENTAI)
internal class Indo18h(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.INDO18H, "indo18h.com", 24) {
	override val withoutAjax = true
}
