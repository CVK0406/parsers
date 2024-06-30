package org.example.dexreader.parsers.site.madara.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGASNOSEKAI", "MangasNoSekai", "es")
internal class MangasNoSekai(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGASNOSEKAI, "mangasnosekai.com")
