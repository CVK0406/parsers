package org.example.dexreader.parsers.site.madara.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("EMPERORSCAN", "EmperorScan", "es")
internal class EmperorScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.EMPERORSCAN, "emperorscan.com")
