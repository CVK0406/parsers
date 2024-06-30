package org.example.dexreader.parsers.site.madara.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("APOLL_COMICS", "ApollComics", "es")
internal class ApollComics(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.APOLL_COMICS, "apollcomics.com", 10)
