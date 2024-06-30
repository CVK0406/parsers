package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("NOCSUMMER", "NocturneSummer", "pt", ContentType.HENTAI)
internal class Nocsummer(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.NOCSUMMER, "nocfsb.com", 18) {
	override val datePattern = "dd 'de' MMMMM 'de' yyyy"
}
