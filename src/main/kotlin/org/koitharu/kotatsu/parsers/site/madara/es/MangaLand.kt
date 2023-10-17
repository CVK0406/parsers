package org.koitharu.kotatsu.parsers.site.madara.es

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.ContentType
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALAND", "MangaLand", "es", ContentType.HENTAI)
internal class MangaLand(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGALAND, "mangaland.net")
