package com.loki.bstream

import com.github.salomonbrys.kodein.Kodein
import com.loki.core.App

class BStreamTestApp : App() {

    var mockModule: Kodein.Module? = null

    override fun addModule(module: Kodein.Module) {
        kodein.clear()
        if (mockModule != null) {
            super.addModule(mockModule!!)
        } else {
            super.addModule(module)
        }
    }
}