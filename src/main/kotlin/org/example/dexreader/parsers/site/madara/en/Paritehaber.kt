package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("PARITEHABER", "Paritehaber", "en", ContentType.HENTAI)
internal class Paritehaber(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.PARITEHABER, "www.paritehaber.com", 10)
