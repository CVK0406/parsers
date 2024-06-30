package org.example.dexreader.parsers

import okhttp3.Headers
import okio.IOException

class CloudFlareProtectedException(
	val url: String,
	val headers: Headers,
) : IOException("Protected by CloudFlare: $url")