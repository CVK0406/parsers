package org.example.dexreader.parsers.site.heancms.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.heancms.HeanCms

@MangaSourceParser("TEMPLESCAN", "TempleScan", "en")
internal class TempleScan(context: MangaLoaderContext) :
	HeanCms(context, MangaSource.TEMPLESCAN, "templescan.net") {
	override val pathManga = "comic"
}
