package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.*
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser
import org.example.dexreader.parsers.util.*

@MangaSourceParser("CONSTELLARCOMIC", "ConstellarComic", "en", ContentType.HENTAI)
internal class Constellarcomic(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.CONSTELLARCOMIC, "constellarcomic.com", pageSize = 30, searchPageSize = 18) {
	override val selectTestScript = "script:containsData(ts_rea_der_._run)"
	override val isTagsExclusionSupported = false

	override suspend fun getDetails(manga: Manga): Manga {
		val docs = webClient.httpGet(manga.url.toAbsoluteUrl(domain)).parseHtml()
		val chapters = docs.select(selectChapter).mapChapters(reversed = true) { index, element ->
			val url = element.selectFirst("a")?.attrAsRelativeUrl("href") ?: return@mapChapters null
			MangaChapter(
				id = generateUid(url),
				name = element.selectFirst(".chapternum")?.textOrNull() ?: "Chapter ${index + 1}",
				url = url,
				number = index + 1,
				scanlator = null,
				uploadDate = 0,
				branch = null,
				source = source,
			)
		}
		return parseInfo(docs, manga, chapters)
	}
}
