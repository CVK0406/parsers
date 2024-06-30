package org.example.dexreader.parsers.site.mangareader.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGASCHAN", "MangasChan", "pt")
internal class MangasChan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MANGASCHAN, "mangaschan.net", pageSize = 20, searchPageSize = 20) {
	override val datePattern = "MMMM d, yyyy"
}
