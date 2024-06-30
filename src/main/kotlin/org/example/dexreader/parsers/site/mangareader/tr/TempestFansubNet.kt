package org.example.dexreader.parsers.site.mangareader.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("TEMPESTFANSUBNET", "TempestFansub.net", "tr")
internal class TempestFansubNet(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.TEMPESTFANSUBNET, "tempestfansub.net", pageSize = 30, searchPageSize = 10)
