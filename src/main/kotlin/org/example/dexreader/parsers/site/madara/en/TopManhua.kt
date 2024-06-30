package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("TOPMANHUA", "TopManhua", "en")
internal class TopManhua(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.TOPMANHUA, "topmanhua.com") {
	override val tagPrefix = "manhua-genre/"
	override val datePattern = "MM/dd/yyyy"
}
