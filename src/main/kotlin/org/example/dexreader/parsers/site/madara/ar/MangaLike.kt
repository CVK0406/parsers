package org.example.dexreader.parsers.site.madara.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALIKE", "MangaLike.net", "ar")
internal class MangaLike(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGALIKE, "manga-like.net", pageSize = 10)
