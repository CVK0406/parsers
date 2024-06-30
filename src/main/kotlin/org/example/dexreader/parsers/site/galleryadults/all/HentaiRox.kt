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

@MangaSourceParser("HENTAIROX", "HentaiRox", type = ContentType.HENTAI)
internal class HentaiRox(context: MangaLoaderContext) :
	GalleryAdultsParser(context, MangaSource.HENTAIROX, "hentairox.com") {
	override val selectGalleryImg = ".inner_thumb img"
	override val selectTags = ".gtags"
	override val selectTag = "li:contains(Tags:)"
	override val selectAuthor = "li:contains(Artists:) span.item_name"
	override val selectLanguageChapter = "li:contains(Languages:) .item_name"

	override suspend fun getAvailableLocales(): Set<Locale> = setOf(
		Locale.ENGLISH,
		Locale.FRENCH,
		Locale.JAPANESE,
		Locale("es"),
		Locale("ru"),
		Locale("ko"),
		Locale.GERMAN,
	)

	override fun Element.parseTags() = select("a.tag, .gallery_title a").mapToSet {
		val key = it.attr("href").removeSuffix('/').substringAfterLast('/')
		val name = it.selectFirst(".item_name")?.text() ?: it.text()
		MangaTag(
			key = key,
			title = name,
			source = source,
		)
	}
}
