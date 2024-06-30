package org.example.dexreader.parsers.site.mangareader.en

import org.example.dexreader.parsers.ErrorMessages
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.*
import org.example.dexreader.parsers.site.mangareader.MangaReaderParser
import org.example.dexreader.parsers.util.domain
import org.example.dexreader.parsers.util.oneOrThrowIfMany
import org.example.dexreader.parsers.util.parseHtml
import java.util.*

@MangaSourceParser("RIZZCOMIC", "RizzComic", "en")
internal class RizzComic(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.RIZZCOMIC, "rizzcomic.com", pageSize = 50, searchPageSize = 20) {
	override val datePattern = "dd MMM yyyy"
	override val listUrl = "/series"

	override val availableSortOrders: Set<SortOrder> = EnumSet.of(SortOrder.ALPHABETICAL)
	override val availableStates: Set<MangaState> = emptySet()
	override val isMultipleTagsSupported = false
	override val isSearchSupported = false
	override val isTagsExclusionSupported = false

	// TODO Query created in json
	override suspend fun getListPage(page: Int, filter: MangaListFilter?): List<Manga> {
		if (page > 1) {
			return emptyList()
		}
		val url = buildString {
			append("https://")
			append(domain)
			when (filter) {

				is MangaListFilter.Search -> {
					throw IllegalArgumentException(ErrorMessages.SEARCH_NOT_SUPPORTED)
				}

				is MangaListFilter.Advanced -> {

					if (filter.tags.isNotEmpty()) {
						append("/genre/")
						filter.tags.oneOrThrowIfMany()?.let {
							append(it.key)
						}
					} else {
						append(listUrl)
					}
				}

				null -> {
					append(listUrl)
				}
			}
		}
		return parseMangaList(webClient.httpGet(url).parseHtml())
	}
}
