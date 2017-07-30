package com.techery.bstream.di

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.android.androidActivityScope
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.scopedSingleton
import com.techery.core.SomethingUseful

val bStreamModule = Kodein.Module(allowSilentOverride = true) {

    bind<SomethingUseful>() with scopedSingleton(androidActivityScope) {
        SomethingUseful()
    }
}