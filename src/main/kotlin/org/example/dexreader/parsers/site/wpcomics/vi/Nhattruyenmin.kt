package org.example.dexreader.parsers.site.wpcomics.vi

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.wpcomics.WpComicsParser

@MangaSourceParser("NHATTRUYENMIN", "NhattruyenPlus", "vi")
internal class Nhattruyenmin(context: MangaLoaderContext) :
	WpComicsParser(context, MangaSource.NHATTRUYENMIN, "nhattruyenmax.com")
