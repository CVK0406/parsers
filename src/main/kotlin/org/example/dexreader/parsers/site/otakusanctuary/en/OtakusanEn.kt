package org.example.dexreader.parsers.site.otakusanctuary.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.otakusanctuary.OtakuSanctuaryParser

@MangaSourceParser("OTAKUSAN_EN", "OtakuSan-En", "en")
internal class OtakusanEn(context: MangaLoaderContext) :
	OtakuSanctuaryParser(context, MangaSource.OTAKUSAN_EN, "otakusan.net") {
	override val lang = "us"
	override val selectState = ".table-info tr:contains(Status) td"
}
