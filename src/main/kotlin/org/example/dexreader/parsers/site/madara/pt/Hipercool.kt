package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("HIPERCOOL", "Hipercool", "pt", ContentType.HENTAI)
internal class Hipercool(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.HIPERCOOL, "hiper.cool", pageSize = 20) {
	override val tagPrefix = "manga-tag/"
}
