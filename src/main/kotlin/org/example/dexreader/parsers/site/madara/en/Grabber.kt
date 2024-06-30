package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("GRABBER", "Grabber", "en", ContentType.COMICS)
internal class Grabber(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.GRABBER, "grabber.zone", 20) {
	override val tagPrefix = "type/"
	override val listUrl = "comics/"
	override val datePattern = "dd.MM.yyyy"
}
