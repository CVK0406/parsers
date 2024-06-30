package org.example.dexreader.parsers.site.wpcomics.vi

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.config.ConfigKey
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.wpcomics.WpComicsParser

@MangaSourceParser("NETTRUYEN", "NetTruyen", "vi")
internal class NetTruyen(context: MangaLoaderContext) :
	WpComicsParser(context, MangaSource.NETTRUYEN, "www.nettruyenlive.com", 36) {
	override val configKeyDomain: ConfigKey.Domain = ConfigKey.Domain(
		"www.nettruyenaz.com",
		"www.nettruyenlive.com",
		"www.nettruyenio.com",
		"www.nettruyento.com",
		"nettruyento.com",
		"nettruyenin.com",
	)
}
