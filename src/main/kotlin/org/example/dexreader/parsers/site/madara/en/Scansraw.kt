package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("SCANSRAW", "AquaScans.com", "en")
internal class Scansraw(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.SCANSRAW, "aquascans.com", 10)
