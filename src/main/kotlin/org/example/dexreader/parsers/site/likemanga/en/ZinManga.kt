package org.example.dexreader.parsers.site.likemanga.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.*
import org.example.dexreader.parsers.site.likemanga.LikeMangaParser

@MangaSourceParser("ZINMANGA_COM", "ZinManga.com", "en")
internal class ZinManga(context: MangaLoaderContext) :
	LikeMangaParser(context, MangaSource.ZINMANGA_COM, "zinmanga.com")
