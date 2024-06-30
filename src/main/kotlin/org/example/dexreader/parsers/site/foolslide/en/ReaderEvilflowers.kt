package org.example.dexreader.parsers.site.foolslide.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.foolslide.FoolSlideParser

@MangaSourceParser("READER_EVILFLOWERS", "Evil Flowers", "en")
internal class ReaderEvilflowers(context: MangaLoaderContext) :
	FoolSlideParser(context, MangaSource.READER_EVILFLOWERS, "reader.evilflowers.com")
