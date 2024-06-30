package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MOONWITCHINLOVESCAN", "MoonWitchinLoveScan", "pt")
internal class Moonwitchinlovescan(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MOONWITCHINLOVESCAN, "moonwitchinlovescan.com", 10) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
