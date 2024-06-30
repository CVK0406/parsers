package org.example.dexreader.parsers.site.nepnep.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.nepnep.NepnepParser

@MangaSourceParser("MANGASEE", "MangaSee", "en")
internal class MangaSee(context: MangaLoaderContext) :
	NepnepParser(context, MangaSource.MANGASEE, "mangasee123.com")
