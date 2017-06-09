package com.techery.moduleapp.di

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.android.androidActivityScope
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.scopedSingleton
import com.techery.moduleapp.routing.Router
import routing.StreamRouting

class KodeinCommonModule {
    val mainActivityModule = Kodein.Module {
        bind<Router>() with scopedSingleton(androidActivityScope) {
            StreamRouting()
        }
    }
}