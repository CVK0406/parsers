package org.example.dexreader.parsers.exception

import org.example.dexreader.parsers.InternalParsersApi

class ParseException @InternalParsersApi @JvmOverloads constructor(
	val shortMessage: String?,
	val url: String,
	cause: Throwable? = null,
) : RuntimeException("$shortMessage at $url", cause)
