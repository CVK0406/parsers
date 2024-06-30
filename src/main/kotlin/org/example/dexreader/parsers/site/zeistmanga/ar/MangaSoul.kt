package org.example.dexreader.parsers.site.zeistmanga.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("MANGASOUL", "MangaSoul", "ar")
internal class MangaSoul(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaSource.MANGASOUL, "www.manga-soul.com")
