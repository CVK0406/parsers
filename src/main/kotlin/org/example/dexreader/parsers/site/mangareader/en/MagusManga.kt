package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MAGUSMANGA", "MagusManga", "en")
internal class MagusManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MAGUSMANGA, "vofeg.com", pageSize = 20, searchPageSize = 10){
	override val listUrl = "/series"
}
