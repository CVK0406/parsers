package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("NITROMANGA", "NitroManga", "en")
internal class NitroManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.NITROMANGA, "nitromanga.com", pageSize = 18)
