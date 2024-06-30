package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGA68", "Manga68", "en")
internal class Manga68(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGA68, "manga68.com") {
	override val withoutAjax = true
}
