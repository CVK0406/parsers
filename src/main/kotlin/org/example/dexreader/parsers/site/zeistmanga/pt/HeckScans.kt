package org.example.dexreader.parsers.site.zeistmanga.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("HECKSCANS", "HeckScans", "pt")
internal class HeckScans(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaSource.HECKSCANS, "heckscans.blogspot.com")
