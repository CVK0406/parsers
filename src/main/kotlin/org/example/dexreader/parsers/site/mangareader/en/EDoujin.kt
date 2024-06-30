package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("EDOUJIN", "EDoujin", "en", ContentType.HENTAI)
internal class EDoujin(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.EDOUJIN, "edoujin.net", pageSize = 25, searchPageSize = 10)
