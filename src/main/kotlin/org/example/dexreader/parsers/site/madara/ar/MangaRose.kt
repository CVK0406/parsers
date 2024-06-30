package org.example.dexreader.parsers.site.madara.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAROSE", "MangaRose", "ar")
internal class MangaRose(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGAROSE, "mangarose.net", pageSize = 20)
