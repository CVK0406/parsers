package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("DEMONSECT", "DemonSect", "pt")
internal class DemonSect(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.DEMONSECT, "demonsect.com.br", 10)
