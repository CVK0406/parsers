package org.example.dexreader.parsers.site.madara.ru

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("BEST_MANGA", "BestManga", "ru")
internal class BestManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.BEST_MANGA, "bestmanga.club") {
	override val datePattern = "dd.MM.yyyy"
	override val postReq = true
}
