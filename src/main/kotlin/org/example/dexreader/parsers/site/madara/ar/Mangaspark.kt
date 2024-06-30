package org.example.dexreader.parsers.site.madara.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGASPARK", "MangaSpark", "ar")
internal class Mangaspark(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGASPARK, "mangaspark.org", pageSize = 10) {
	override val postReq = true
	override val datePattern = "d MMMM، yyyy"
}
