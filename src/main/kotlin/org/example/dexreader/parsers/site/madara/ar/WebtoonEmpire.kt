package org.example.dexreader.parsers.site.madara.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("WEBTOONEMPIRE", "WebtoonEmpire", "ar")
internal class WebtoonEmpire(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.WEBTOONEMPIRE, "webtoonsempireron.com", pageSize = 10) {
	override val listUrl = "webtoon/"
	override val datePattern = "d MMMM، yyyy"
}
