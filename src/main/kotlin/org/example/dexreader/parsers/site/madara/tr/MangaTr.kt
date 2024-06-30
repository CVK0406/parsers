package org.example.dexreader.parsers.site.madara.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGATR", "MangaTr", "tr")
internal class MangaTr(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGATR, "mangatr.net") {
	override val tagPrefix = "tur/"
}
