package org.example.dexreader.parsers.site.madara.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALEK", "MangaLeku", "ar")
internal class MangaLek(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGALEK, "manga-leko.com", pageSize = 10)
