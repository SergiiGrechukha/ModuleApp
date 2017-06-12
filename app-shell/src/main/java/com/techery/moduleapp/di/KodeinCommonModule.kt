package com.techery.moduleapp.di

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.android.androidActivityScope
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.scopedSingleton
import com.techery.moduleapp.routing.Router
import routing.StreamRouting

val mainActivityModule = Kodein.Module(allowSilentOverride = true) {
    bind<Router>() with instance(StreamRouting())
}