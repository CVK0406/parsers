package org.example.dexreader.parsers.site.madara.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("HOIFANSUB", "HoiFansub", "tr")
internal class HoiFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.HOIFANSUB, "hoifansub.com", 20)
