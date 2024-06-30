package org.example.dexreader.parsers.site.mmrcms.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mmrcms.MmrcmsParser
import java.util.Locale

@MangaSourceParser("SCANMANGAVF_WS", "ScanMangaVf.ws", "fr")
internal class ScanMangaVfWs(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaSource.SCANMANGAVF_WS, "scanmanga-vf.ws") {
	override val imgUpdated = ".jpg"
	override val selectTag = "dt:contains(Genres)"
	override val selectAlt = "dt:contains(Appelé aussi)"
	override val sourceLocale: Locale = Locale.ENGLISH
}
