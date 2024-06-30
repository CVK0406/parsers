package org.example.dexreader.parsers.site.zeistmanga.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("ROCKSMANGA_COM", "RocksManga.com", "ar")
internal class RocksManga(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaSource.ROCKSMANGA_COM, "rocks-manga.com")
