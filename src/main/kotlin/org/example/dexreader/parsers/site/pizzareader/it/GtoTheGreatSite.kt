package org.example.dexreader.parsers.site.pizzareader.it

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.pizzareader.PizzaReaderParser

@MangaSourceParser("GTOTHEGREATSITE", "GtoTheGreatSite", "it")
internal class GtoTheGreatSite(context: MangaLoaderContext) :
	PizzaReaderParser(context, MangaSource.GTOTHEGREATSITE, "reader.gtothegreatsite.net")
