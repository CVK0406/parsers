package org.example.dexreader.parsers.site.madara.vi

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAZODIAC", "MangaZodiac", "vi")
internal class MangaZodiac(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGAZODIAC, "mangazodiac.com")
