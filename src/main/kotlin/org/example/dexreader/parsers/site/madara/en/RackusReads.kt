package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("RACKUSREADS", "RackusReads", "en")
internal class RackusReads(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.RACKUSREADS, "rackusreads.com", 20) {
	override val datePattern = "MM/dd/yyyy"
}
