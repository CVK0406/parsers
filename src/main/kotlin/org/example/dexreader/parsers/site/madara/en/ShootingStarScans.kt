package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("SHOOTINGSTARSCANS", "Shooting Star Scans", "en")
internal class ShootingStarScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.SHOOTINGSTARSCANS, "shootingstarscans.com") {
	override val tagPrefix = "manga-tag/"
}
