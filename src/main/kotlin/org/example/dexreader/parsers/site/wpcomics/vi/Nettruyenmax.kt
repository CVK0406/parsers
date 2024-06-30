package org.example.dexreader.parsers.site.wpcomics.vi

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.wpcomics.WpComicsParser

@MangaSourceParser("NETTRUYENMAX", "NettruyenBing", "vi")
internal class Nettruyenmax(context: MangaLoaderContext) :
	WpComicsParser(context, MangaSource.NETTRUYENMAX, "www.nettruyenbb.com", 36)
