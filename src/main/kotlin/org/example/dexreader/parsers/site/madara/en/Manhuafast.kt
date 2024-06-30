package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHUAFAST", "ManhuaFast", "en")
internal class Manhuafast(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANHUAFAST, "manhuafast.com")
