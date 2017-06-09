package com.techery.core

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.android.androidActivityScope
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.scopedSingleton

class SomethingModule {

    val coreModule = Kodein.Module {
        bind<SomethingUseful>() with scopedSingleton(androidActivityScope) {
            SomethingUseful()
        }
    }
}