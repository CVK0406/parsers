package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("RANDOMSCANS", "RandomScans", "pt")
internal class RandomScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.RANDOMSCANS, "luratoon.com")
