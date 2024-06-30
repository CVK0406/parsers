package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("FLAMECOMICS", "FlameComics", "en")
internal class FlameComics(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.FLAMECOMICS, "flamecomics.com", pageSize = 24, searchPageSize = 10) {
	override val listUrl = "/series"
}
