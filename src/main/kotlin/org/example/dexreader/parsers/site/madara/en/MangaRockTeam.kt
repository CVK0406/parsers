package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAROCKTEAM", "MangaRock.team", "en")
internal class MangaRockTeam(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGAROCKTEAM, "mangarockteam.com")
