package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAACTION", "MangaAction", "en")
internal class MangaAction(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGAACTION, "mangaaction.com")
