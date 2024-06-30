package org.example.dexreader.parsers.config

interface MangaSourceConfig {

	operator fun <T> get(key: ConfigKey<T>): T
}
