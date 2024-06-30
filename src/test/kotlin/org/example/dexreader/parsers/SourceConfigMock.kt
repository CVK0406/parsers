package org.example.dexreader.parsers

import org.example.dexreader.parsers.config.ConfigKey
import org.example.dexreader.parsers.config.MangaSourceConfig

internal class SourceConfigMock : MangaSourceConfig {

	override fun <T> get(key: ConfigKey<T>): T = key.defaultValue
}
