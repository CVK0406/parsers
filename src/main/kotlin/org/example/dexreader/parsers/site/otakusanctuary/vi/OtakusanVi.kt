package org.example.dexreader.parsers.site.otakusanctuary.vi

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.otakusanctuary.OtakuSanctuaryParser

@MangaSourceParser("OTAKUSAN_VI", "OtakuSan-Vi", "vi")
internal class OtakusanVi(context: MangaLoaderContext) :
	OtakuSanctuaryParser(context, MangaSource.OTAKUSAN_VI, "otakusan.net") {
	override val selectState = ".table-info tr:contains(Status) td"
	override val lang = "vn"
}
