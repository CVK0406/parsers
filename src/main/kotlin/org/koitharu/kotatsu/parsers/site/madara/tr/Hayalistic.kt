package org.koitharu.kotatsu.parsers.site.madara.tr


import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser


@MangaSourceParser("HAYALISTIC", "Hayalistic", "vi")
internal class Hayalistic(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.HAYALISTIC, "hayalistic.com", 24) {

	override val datePattern = "dd/MM/yyyy"
}
