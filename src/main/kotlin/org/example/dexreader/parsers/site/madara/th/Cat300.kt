package org.example.dexreader.parsers.site.madara.th

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.madara.MadaraParser

@MangaSourceParser("CAT_300", "Cat300", "th", ContentType.HENTAI)
internal class Cat300(context: MangaLoaderContext) : MadaraParser(context, MangaSource.CAT_300, "cat300.com") {
	override val datePattern = "MMMM dd, yyyy"
	override val withoutAjax = true
}
