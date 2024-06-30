package org.example.dexreader.parsers.site.madara.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

//Manga +18 require login.
@MangaSourceParser("VIYAFANSUB", "ViyaFansub", "tr", ContentType.HENTAI)
internal class ViyaFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.VIYAFANSUB, "viyafansub.com")
