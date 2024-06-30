package org.example.dexreader.parsers.site.mangareader.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("CARTELDEMANHWAS", "Cartel De Manhwas", "es")
internal class CartelDeManhwas(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.CARTELDEMANHWAS, "carteldemanhwas.com", pageSize = 20, searchPageSize = 20) {
	override val listUrl = "/series"
	override val datePattern = "MMM d, yyyy"
}
