package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("NVMANGA", "NvManga", "en")
internal class NvManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.NVMANGA, "nvmanga.com") {
	override val datePattern = "dd/MM/yyyy"
	override val tagPrefix = "genre/"
	override val listUrl = "webtoon/"
}
