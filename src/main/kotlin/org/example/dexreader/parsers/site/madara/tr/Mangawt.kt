package org.example.dexreader.parsers.site.madara.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAWT", "MangaWt", "tr")
internal class Mangawt(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGAWT, "mangawt.com")
