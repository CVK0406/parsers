package org.example.dexreader.parsers.site.madara.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANWE", "Manwe", "tr")
internal class Manwe(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANWE, "manwe.pro", 20)
