package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAKISS", "MangaKiss", "en")
internal class MangaKiss(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGAKISS, "mangakiss.org", 10)
