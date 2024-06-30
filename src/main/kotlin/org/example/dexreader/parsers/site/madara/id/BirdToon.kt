package org.example.dexreader.parsers.site.madara.id

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser
import java.util.Locale

@MangaSourceParser("BIRDTOON", "BirdToon", "id", ContentType.HENTAI)
internal class BirdToon(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.BIRDTOON, "birdtoon.net", 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val tagPrefix = "komik-genre/"
	override val listUrl = "komik/"
}
