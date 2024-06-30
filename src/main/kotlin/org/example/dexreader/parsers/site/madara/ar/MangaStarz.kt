package org.example.dexreader.parsers.site.madara.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGASTARZ", "MangaStarz", "ar")
internal class MangaStarz(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGASTARZ, "mangastarz.org", pageSize = 10) {
	override val datePattern = "d MMMM، yyyy"
}
