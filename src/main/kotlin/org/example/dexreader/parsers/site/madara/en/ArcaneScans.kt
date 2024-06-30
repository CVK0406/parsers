package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("ARCANESCANS", "ArcaneScans", "en")
internal class ArcaneScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.ARCANESCANS, "arcanescans.com", 10)
