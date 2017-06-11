package com.techery.astream.di

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.android.androidActivityScope
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.scopedSingleton
import com.techery.core.SomethingUseful

class BStreamModule {

    val bStreamModule = Kodein.Module {
        bind<SomethingUseful>() with scopedSingleton(androidActivityScope) {
            SomethingUseful()
        }
    }
}