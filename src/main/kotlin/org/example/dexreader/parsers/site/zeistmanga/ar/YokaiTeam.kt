package org.example.dexreader.parsers.site.zeistmanga.ar

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("YOKAITEAM", "YokaiTeam", "ar")
internal class YokaiTeam(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaSource.YOKAITEAM, "yokai-team.blogspot.com")
