package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MORTALSGROOVE", "Mortals Groove", "en")
internal class MortalsGroove(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MORTALSGROOVE, "mortalsgroove.com") {
	override val postReq = true
}
