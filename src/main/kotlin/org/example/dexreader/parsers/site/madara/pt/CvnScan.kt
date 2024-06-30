package org.example.dexreader.parsers.site.madara.pt

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("CVNSCAN", "CvnScan", "pt", ContentType.HENTAI)
internal class CvnScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.CVNSCAN, "cvnscan.com")
