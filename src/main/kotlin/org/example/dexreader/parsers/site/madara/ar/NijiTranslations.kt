package org.example.dexreader.parsers.site.madara.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("NIJITRANSLATIONS", "Niji Translations", "ar")
internal class NijiTranslations(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.NIJITRANSLATIONS, "niji-translations.com") {
	override val postReq = true
}
