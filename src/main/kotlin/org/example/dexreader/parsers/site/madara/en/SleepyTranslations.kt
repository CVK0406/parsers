package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("SLEEPYTRANSLATIONS", "Sleepy Translations", "en")
internal class SleepyTranslations(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.SLEEPYTRANSLATIONS, "sleepytranslations.com", 16) {
	override val listUrl = "series/"
	override val tagPrefix = "genre/"
}
