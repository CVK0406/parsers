package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGA_MANHUA", "MangaManhua", "en")
internal class MangaManhua(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGA_MANHUA, "mangaonlineteam.com", pageSize = 10)
