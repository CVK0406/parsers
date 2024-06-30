package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("YANPFANSUB", "YanpFansub", "pt")
internal class YanpFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.YANPFANSUB, "yanpfansub.com")
