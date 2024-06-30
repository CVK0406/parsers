package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWAFULL", "ManhwaFull", "en")
internal class ManhwaFull(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANHWAFULL, "manhwafull.com") {
	override val listUrl = "manga-all-manhwa/"
	override val datePattern = "MM/dd/yyyy"
}
