package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("ITSYOURIGHTMANHUA", "ItsYouRightManhua", "en")
internal class Itsyourightmanhua(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.ITSYOURIGHTMANHUA, "itsyourightmanhua.com", 10)
