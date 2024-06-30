package org.example.dexreader.parsers.site.mangadventure.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.Manga
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.mangadventure.MangAdventureParser
import org.example.dexreader.parsers.util.urlEncoded

@MangaSourceParser("ARCRELIGHT", "Arc-Relight", "en")
internal class ArcRelight(context: MangaLoaderContext) :
	MangAdventureParser(context, MangaSource.ARCRELIGHT, "arc-relight.com", pageSize = 10) {
	private val franchises = setOf("Jubilee", "Steins;Gate", "Robotics;Notes", "Chaos;Head")

	override suspend fun getRelatedManga(seed: Manga): List<Manga> {
		val tags = franchises.filter { franchise ->
			seed.tags.find { it.key == franchise } != null
		}
		if (tags.isEmpty()) return emptyList()
		val url = apiUrl.addEncodedPathSegment("series")
			.addQueryParameter("categories", tags.joinToString(","))
		return getManga(url.get())
	}
}
