package org.example.dexreader.parsers.site.mangadventure.en

import androidx.collection.ArraySet
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.model.MangaTag
import org.example.dexreader.parsers.site.mangadventure.MangAdventureParser

@MangaSourceParser("ASSORTEDSCANS", "Assorted Scans", "en")
internal class AssortedScans(context: MangaLoaderContext) :
	MangAdventureParser(context, MangaSource.ASSORTEDSCANS, "assortedscans.com") {
	// tags that don't have any series and make the tests fail
	private val emptyTags = setOf(
		"Doujinshi", "Harem", "Hentai", "Mecha",
		"Shoujo Ai", "Shounen Ai", "Smut", "Yaoi",
	)

	override suspend fun getAvailableTags(): Set<MangaTag> {
		val tags = super.getAvailableTags()
		return tags.filterNotTo(ArraySet(tags.size)) { it.key in emptyTags }
	}
}
