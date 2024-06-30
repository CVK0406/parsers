package org.example.dexreader.parsers.site.madtheme.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madtheme.MadthemeParser

@MangaSourceParser("MANGAPUMA", "MangaPuma", "en")
internal class MangaPuma(context: MangaLoaderContext) :
	MadthemeParser(context, MangaSource.MANGAPUMA, "mangapuma.com")
