package org.example.dexreader.parsers.site.madara.all

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser
import java.util.Locale

@MangaSourceParser("MANYTOON_CLUB", "ManyToon.club", "", ContentType.HENTAI)
internal class ManyToonClub(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANYTOON_CLUB, "manytoon.club") {
	override val postReq = true
	override val listUrl = "manhwa-raw/"
	override val tagPrefix = "manhwa-raw-genre/"
	override val sourceLocale: Locale = Locale.ENGLISH
}
