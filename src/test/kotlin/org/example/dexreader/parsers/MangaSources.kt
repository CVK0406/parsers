package org.example.dexreader.parsers

import org.junit.jupiter.params.provider.EnumSource
import org.example.dexreader.parsers.model.MangaSource

@EnumSource(MangaSource::class, names = ["LOCAL", "DUMMY"], mode = EnumSource.Mode.EXCLUDE)
internal annotation class MangaSources
