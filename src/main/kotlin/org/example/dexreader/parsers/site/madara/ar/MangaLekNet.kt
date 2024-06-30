package org.example.dexreader.parsers.site.madara.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALEK_NET", "MangaLek.net", "ar")
internal class MangaLekNet(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGALEK_NET, "manga-lek.net", pageSize = 10)
