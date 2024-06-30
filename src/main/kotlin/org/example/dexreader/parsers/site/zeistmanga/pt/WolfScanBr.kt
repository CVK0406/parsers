package org.example.dexreader.parsers.site.zeistmanga.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("WOLFSCANBR", "WolfScanBr", "pt")
internal class WolfScanBr(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaSource.WOLFSCANBR, "wolfscanbr.blogspot.com")
