package org.example.dexreader.parsers.site.madtheme.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madtheme.MadthemeParser

@MangaSourceParser("MANGAXYZ", "MangaXyz", "en")
internal class Mangaxyz(context: MangaLoaderContext) :
	MadthemeParser(context, MangaSource.MANGAXYZ, "mangaxyz.com")
