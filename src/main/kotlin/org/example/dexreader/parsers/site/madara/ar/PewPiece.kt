package org.example.dexreader.parsers.site.madara.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("PEWPIECE", "PewPiece", "ar")
internal class PewPiece(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.PEWPIECE, "pewpiece.com")
