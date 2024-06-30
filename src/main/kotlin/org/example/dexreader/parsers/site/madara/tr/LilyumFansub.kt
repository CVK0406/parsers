package org.example.dexreader.parsers.site.madara.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("LILYUMFANSUB", "LilyumFansub", "tr")
internal class LilyumFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.LILYUMFANSUB, "lilyumfansub.com.tr", 16)
