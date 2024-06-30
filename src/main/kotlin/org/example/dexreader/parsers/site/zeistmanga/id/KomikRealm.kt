package org.example.dexreader.parsers.site.zeistmanga.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("KOMIKREALM", "KomikRealm", "id")
internal class KomikRealm(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaSource.KOMIKREALM, "www.komikrealm.my.id")
