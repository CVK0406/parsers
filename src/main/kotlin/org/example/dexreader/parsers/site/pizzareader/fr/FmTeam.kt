package org.example.dexreader.parsers.site.pizzareader.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.pizzareader.PizzaReaderParser

@MangaSourceParser("FMTEAM", "FmTeam", "fr")
internal class FmTeam(context: MangaLoaderContext) :
	PizzaReaderParser(context, MangaSource.FMTEAM, "fmteam.fr") {
	override val ongoingFilter = "en cours"
	override val completedFilter = "terminé"
}
