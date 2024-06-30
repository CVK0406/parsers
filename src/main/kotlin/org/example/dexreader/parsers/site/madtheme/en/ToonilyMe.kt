package org.example.dexreader.parsers.site.madtheme.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madtheme.MadthemeParser

@MangaSourceParser("TOONILY_ME", "Toonily.Me", "en", ContentType.HENTAI)
internal class ToonilyMe(context: MangaLoaderContext) :
	MadthemeParser(context, MangaSource.TOONILY_ME, "toonily.me") {
	override val selectDesc = "div.summary div.section-body p.content"
}
