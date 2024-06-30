package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("COMIZ", "Comiz", "en", ContentType.HENTAI)
internal class Comiz(context: MangaLoaderContext) : MadaraParser(context, MangaSource.COMIZ, "v2.comiz.net", 10)
