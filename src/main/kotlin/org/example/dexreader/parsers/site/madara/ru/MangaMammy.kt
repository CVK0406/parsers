package org.example.dexreader.parsers.site.madara.ru

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAMAMMY", "MangaMammy", "ru")
internal class MangaMammy(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGAMAMMY, "mangamammy.ru") {
	override val datePattern = "dd.MM.yyyy"
	override val postReq = true
}
