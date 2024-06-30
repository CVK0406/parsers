package org.example.dexreader.parsers.site.galleryadults.all

import org.jsoup.nodes.Element
import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.model.MangaTag
import org.example.dexreader.parsers.site.galleryadults.GalleryAdultsParser
import org.example.dexreader.parsers.util.mapToSet
import org.example.dexreader.parsers.util.removeSuffix
import java.util.*

@MangaSourceParser("ASMHENTAI", "AsmHentai", type = ContentType.HENTAI)
internal class AsmHentai(context: MangaLoaderContext) :
	GalleryAdultsParser(context, MangaSource.ASMHENTAI, "asmhentai.com") {
	override val selectGallery = ".preview_item"
	override val selectGalleryLink = ".image a"
	override val selectGalleryImg = ".image img"
	override val pathTagUrl = "/tags/?page="
	override val selectAuthor = "div.tags:contains(Artists:) .tag_list a span.tag"
	override val idImg = "fimg"

	override suspend fun getAvailableLocales(): Set<Locale> = setOf(
		Locale.ENGLISH,
		Locale.JAPANESE,
		Locale.CHINESE,
		Locale("tr"),
	)

	override fun Element.parseTags() = select("a").mapToSet {
		val key = it.attr("href").removeSuffix('/').substringAfterLast('/')
		val name = it.selectFirst(".tag")?.html()?.substringBefore("<") ?: it.html().substringBefore("<")
		MangaTag(
			key = key,
			title = name,
			source = source,
		)
	}
}
