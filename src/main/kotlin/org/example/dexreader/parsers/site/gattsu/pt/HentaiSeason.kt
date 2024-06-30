package org.example.dexreader.parsers.site.gattsu.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.gattsu.GattsuParser

@MangaSourceParser("HENTAISEASON", "HentaiSeason", "pt", ContentType.HENTAI)
internal class HentaiSeason(context: MangaLoaderContext) :
	GattsuParser(context, MangaSource.HENTAISEASON, "hentaiseason.com")
