package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGA18H", "Manga18h", "en", ContentType.HENTAI)
internal class Manga18h(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGA18H, "manga18h.xyz", 20)
