package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("CULTUREDWORKS", "CulturedWorks", "en")
internal class CulturedWorks(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.CULTUREDWORKS, "culturedworks.com", pageSize = 20, searchPageSize = 10) {
	override val selectMangaList = ".listupd .bs .bsx"
}
