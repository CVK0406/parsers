package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("KAKUSEIPROJECT", "Kakusei Project", "pt")
internal class KakuseiProject(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.KAKUSEIPROJECT, "kakuseiproject.com.br", 10)
