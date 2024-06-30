package org.example.dexreader.parsers.site.madara.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALIONZ", "MangaLionz", "ar")
internal class MangaLionz(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGALIONZ, "mangalionz.org", pageSize = 10)
