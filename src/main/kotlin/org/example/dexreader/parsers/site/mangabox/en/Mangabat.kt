package org.example.dexreader.parsers.site.mangabox.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.config.ConfigKey
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangabox.MangaboxParser

@MangaSourceParser("HMANGABAT", "MangaBat", "en")
internal class Mangabat(context: MangaLoaderContext) :
	MangaboxParser(context, MangaSource.HMANGABAT) {
	override val configKeyDomain = ConfigKey.Domain("h.mangabat.com", "readmangabat.com")
	override val otherDomain = "readmangabat.com"
	override val selectTagMap = "div.panel-category p.pn-category-row:not(.pn-category-row-border) a"
}
