package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("STKISSMANGA_COM", "1stKissManga.com", "en")
internal class StkissMangaCom(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.STKISSMANGA_COM, "1stkiss-manga.com", 10)
