package org.example.dexreader.parsers.site.madara.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("COMICARAB", "ComicArab", "ar")
internal class ComicArab(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.COMICARAB, "comicarab.com", pageSize = 24) {
	override val datePattern = "d MMMM، yyyy"
}
