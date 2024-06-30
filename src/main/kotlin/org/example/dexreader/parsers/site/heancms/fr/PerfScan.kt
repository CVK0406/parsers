package org.example.dexreader.parsers.site.heancms.fr

import org.example.dexreader.parsers.MangaLoaderContext
import org.example.dexreader.parsers.MangaSourceParser
import org.example.dexreader.parsers.model.MangaSource
import org.example.dexreader.parsers.site.heancms.HeanCms

@MangaSourceParser("PERF_SCAN", "PerfScan", "fr")
internal class PerfScan(context: MangaLoaderContext) :
	HeanCms(context, MangaSource.PERF_SCAN, "perf-scan.fr")
