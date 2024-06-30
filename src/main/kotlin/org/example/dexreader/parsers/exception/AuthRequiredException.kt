package org.example.dexreader.parsers.exception

import org.example.dexreader.parsers.InternalParsersApi
import org.example.dexreader.parsers.model.MangaSource

/**
 * Authorization is required for access to the requested content
 */
class AuthRequiredException @InternalParsersApi @JvmOverloads constructor(
	val source: MangaSource,
	cause: Throwable? = null,
) : RuntimeException("Authorization required", cause)
