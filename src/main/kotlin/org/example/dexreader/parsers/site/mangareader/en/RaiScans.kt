package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("RAISCANS", "RaiScans", "en")
internal class RaiScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.RAISCANS, "www.raiscans.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/Series"
}
