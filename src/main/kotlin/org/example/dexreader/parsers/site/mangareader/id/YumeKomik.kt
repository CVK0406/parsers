package org.example.dexreader.parsers.site.mangareader.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("YUMEKOMIK", "YumeKomik", "id")
internal class YumeKomik(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.YUMEKOMIK, "yumekomik.com", pageSize = 20, searchPageSize = 10)
