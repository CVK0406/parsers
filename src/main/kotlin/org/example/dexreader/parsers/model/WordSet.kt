package org.example.dexreader.parsers.model

import org.example.dexreader.parsers.InternalParsersApi

@InternalParsersApi
class WordSet(private vararg val words: String) {

	fun anyWordIn(dateString: String): Boolean = words.any {
		dateString.contains(it, ignoreCase = true)
	}
}
