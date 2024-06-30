package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHUAES", "ManhuaEs", "en")
internal class Manhuaes(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANHUAES, "manhuaes.com") {
	override val postReq = true
}
