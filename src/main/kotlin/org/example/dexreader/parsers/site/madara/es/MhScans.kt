package org.example.dexreader.parsers.site.madara.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MHSCANS", "MhScans", "es")
internal class MhScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MHSCANS, "mhscans.com") {
	override val datePattern = "d 'de' MMMMM 'de' yyyy"
}
