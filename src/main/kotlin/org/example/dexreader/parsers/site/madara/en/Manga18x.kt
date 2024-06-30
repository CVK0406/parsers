package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGA18X", "Manga18x", "en", ContentType.HENTAI)
internal class Manga18x(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGA18X, "manga18x.net", 24)
