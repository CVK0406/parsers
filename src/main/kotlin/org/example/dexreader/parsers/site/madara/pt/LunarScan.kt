package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("LUNARSCAN", "LunarScan.com.br", "pt")
internal class LunarScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.LUNARSCAN, "lunarscan.com.br") {
	override val listUrl = "obra/"
}
