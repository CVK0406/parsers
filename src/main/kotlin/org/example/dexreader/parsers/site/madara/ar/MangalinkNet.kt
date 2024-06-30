package org.example.dexreader.parsers.site.madara.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALINKNET", "MangaLink.net", "ar")
internal class MangalinkNet(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGALINKNET, "manga-link.net", pageSize = 10)
