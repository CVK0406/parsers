package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.Manga
import org.example.dexreader.parsers.model.MangaListFilter
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.model.MangaState
import org.example.dexreader.parsers.model.SortOrder
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser
import org.example.dexreader.parsers.util.domain
import org.example.dexreader.parsers.util.oneOrThrowIfMany
import org.example.dexreader.parsers.util.parseHtml
import org.example.dexreader.parsers.util.urlEncoded
import java.util.*

@MangaSourceParser("ZAHARD", "Zahard", "en")
internal class Zahard(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.ZAHARD, "zahard.xyz", pageSize = 20, searchPageSize = 30) {

	override val listUrl = "/library"
	override val selectChapter = "#chapterlist > ul > a"
	override val selectPage = "div#chapter_imgs img"
	override val availableSortOrders: Set<SortOrder> = EnumSet.of(SortOrder.NEWEST)
	override val availableStates: Set<MangaState> = emptySet()
	override val isMultipleTagsSupported = false
	override val isTagsExclusionSupported = false

	override suspend fun getListPage(page: Int, filter: MangaListFilter?): List<Manga> {
		val url = buildString {
			append("https://")
			append(domain)
			append(listUrl)
			append("?page=")
			append(page.toString())
			when (filter) {

				is MangaListFilter.Search -> {
					append("&search=")
					append(filter.query.urlEncoded())
				}

				is MangaListFilter.Advanced -> {
					filter.tags.oneOrThrowIfMany()?.let {
						append("tag=")
						append(it.key)
					}
				}

				null -> {}
			}
		}
		return parseMangaList(webClient.httpGet(url).parseHtml())
	}
}
