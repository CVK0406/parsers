package org.example.dexreader.parsers.site.manga18.en

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.manga18.Manga18Parser

@MangaSourceParser("PORNCOMIC18", "18PornComic", "en", ContentType.HENTAI)
internal class PornComic18(context: MangaLoaderContext) :
	Manga18Parser(context, MangaSource.PORNCOMIC18, "18porncomic.com") {
	override val selectTag = "div.item:not(.info_label) div.info_value a"
}
