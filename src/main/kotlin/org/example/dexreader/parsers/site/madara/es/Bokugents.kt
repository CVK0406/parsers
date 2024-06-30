package org.example.dexreader.parsers.site.madara.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("BOKUGENTS", "Bokugents", "es")
internal class Bokugents(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.BOKUGENTS, "bokugents.com")
// For this source need to enable the option to ignore SSL errors
