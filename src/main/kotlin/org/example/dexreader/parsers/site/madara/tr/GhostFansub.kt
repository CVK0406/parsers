package org.example.dexreader.parsers.site.madara.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("GHOSTFANSUB", "GhostFansub", "tr")
internal class GhostFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.GHOSTFANSUB, "ghostfansub.co", 18)
// you now need to log in to access content
