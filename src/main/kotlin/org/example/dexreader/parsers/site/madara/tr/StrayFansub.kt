package org.example.dexreader.parsers.site.madara.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("STRAYFANSUB", "StrayFansub", "tr", ContentType.HENTAI)
internal class StrayFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.STRAYFANSUB, "strayfansub.homes")
