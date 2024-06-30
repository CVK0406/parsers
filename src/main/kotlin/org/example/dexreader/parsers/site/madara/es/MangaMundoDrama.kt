package org.example.dexreader.parsers.site.madara.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAMUNDODRAMA", "MangaMundoDrama", "es")
internal class MangaMundoDrama(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGAMUNDODRAMA, "manga.mundodrama.site") {

	override val listUrl = "mg/"
}
