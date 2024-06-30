package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MOONLOVERSSCAN", "MoonLoversScan", "pt", ContentType.HENTAI)
internal class MoonLoversScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MOONLOVERSSCAN, "moonloversscan.com.br", 10)
