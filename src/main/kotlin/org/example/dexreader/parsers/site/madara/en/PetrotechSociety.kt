package org.example.dexreader.parsers.site.madara.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("PETROTECHSOCIETY", "Petrotech Society", "en", ContentType.HENTAI)
internal class PetrotechSociety(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.PETROTECHSOCIETY, "www.petrotechsociety.org", pageSize = 10) {
	override val postReq = true
}
