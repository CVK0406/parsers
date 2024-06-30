package org.example.dexreader.parsers.site.madara.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("PIEDPIPERFANSUB", "PiedpiperFansub", "tr")
internal class PiedpiperFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.PIEDPIPERFANSUB, "piedpiperfansub.me", 18) {
	override val datePattern = "d MMMM yyyy"
}
