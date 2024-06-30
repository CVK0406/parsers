package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MURIMSCAN", "MurimScan", "en")
internal class MurimScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MURIMSCAN, "murimscan.run", 100) {
	override val withoutAjax = true
	override val postReq = true
}
