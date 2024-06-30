package org.example.dexreader.parsers.site.mangareader.tr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MOONDAISY_SCANS", "MoonDaisyScans", "tr", ContentType.HENTAI)
internal class MoonDaisyScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MOONDAISY_SCANS, "moondaisyscans.biz", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
