package org.example.dexreader.parsers.site.madtheme.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madtheme.MadthemeParser

@MangaSourceParser("MANGACUTE", "MangaCute", "en")
internal class MangaCute(context: MangaLoaderContext) :
	MadthemeParser(context, MangaSource.MANGACUTE, "mangacute.com")
