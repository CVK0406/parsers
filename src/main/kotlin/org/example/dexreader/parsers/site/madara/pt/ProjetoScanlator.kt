package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("PROJETOSCANLATOR", "ProjetoScanlator", "pt")
internal class ProjetoScanlator(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.PROJETOSCANLATOR, "projetoscanlator.com", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
