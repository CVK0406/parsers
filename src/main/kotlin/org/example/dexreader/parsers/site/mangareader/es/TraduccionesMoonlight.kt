package org.example.dexreader.parsers.site.mangareader.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("TRADUCCIONESMOONLIGHT", "TraduccionesMoonlight", "es", ContentType.HENTAI)
internal class TraduccionesMoonlight(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.TRADUCCIONESMOONLIGHT, "traduccionesmoonlight.com", 20, 10)
