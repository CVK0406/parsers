package org.example.dexreader.parsers.site.ru.grouple

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.config.ConfigKey
import org.example.dexreader.parsers.exception.AuthRequiredException
import org.example.dexreader.parsers.exception.ParseException
import org.example.dexreader.parsers.model.ContentType
import org.example.dexreader.parsers.model.MangaChapter
import org.example.dexreader.parsers.model.MangaPage
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.util.domain
import org.example.dexreader.parsers.util.parseFailed
import org.example.dexreader.parsers.util.parseHtml
import org.example.dexreader.parsers.util.urlEncoded

@MangaSourceParser("ALLHENTAI", "AllHentai", "ru", type = ContentType.HENTAI)
internal class AllHentaiParser(
	context: MangaLoaderContext,
) : GroupleParser(context, MangaSource.ALLHENTAI, 1) {

	override val configKeyDomain = ConfigKey.Domain(
		"20.allhen.online",
		"24.allhen.online",
		"z.allhen.online",
		"2023.allhen.online",
	)
	override val defaultIsNsfw = true

	override val authUrl: String
		get() {
			val targetUri = "https://$domain/".urlEncoded()
			return "https://qawa.org/internal/auth/login?targetUri=$targetUri&siteId=1"
		}

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		try {
			return super.getPages(chapter)
		} catch (e: ParseException) {
			if (isAuthorized) {
				throw e
			} else {
				throw AuthRequiredException(source, e)
			}
		}
	}

	override suspend fun getUsername(): String {
		val root = webClient.httpGet("https://qawa.org/").parseHtml().body()
		val element = root.selectFirst("img.user-avatar") ?: throw AuthRequiredException(source)
		val res = element.parent()?.text()
		return if (res.isNullOrEmpty()) {
			root.parseFailed("Cannot find username")
		} else {
			res
		}
	}
}
