package org.example.dexreader.parsers.site.madara.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("WORLDMANHWAS", "WorldManhwas", "id", ContentType.HENTAI)
internal class WorldManhwas(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.WORLDMANHWAS, "worldmanhwas.zone", 10) {
	override val tagPrefix = "genre/"
	override val listUrl = "komik/"
	override val datePattern = "d MMMM yyyy"
}
