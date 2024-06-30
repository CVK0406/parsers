package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("NINJASCAN", "NinjaScan", "pt")
internal class NinjaScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.NINJASCAN, "ninjascan.site") {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
