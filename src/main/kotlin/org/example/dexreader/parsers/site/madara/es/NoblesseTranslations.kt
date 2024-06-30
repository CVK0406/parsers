package org.example.dexreader.parsers.site.madara.es

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("NOBLESSETRANSLATIONS", "NoblesseTranslations", "es")
internal class NoblesseTranslations(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.NOBLESSETRANSLATIONS, "www.noblessev1.com")
