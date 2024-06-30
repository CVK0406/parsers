package org.example.dexreader.parsers.site.madara.th

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("BAKAMAN", "BakaMan", "th")
internal class BakaMan(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.BAKAMAN, "bakaman.net", pageSize = 18) {
	override val datePattern = "MMMM dd, yyyy"
}
