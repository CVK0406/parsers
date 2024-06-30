package org.example.dexreader.parsers.site.madara.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALINK_AR", "MangaLink.org", "ar")
internal class MangalinkParser(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGALINK_AR, "manga-link.org", pageSize = 10) {
	override val listUrl = "readcomics/"
}
