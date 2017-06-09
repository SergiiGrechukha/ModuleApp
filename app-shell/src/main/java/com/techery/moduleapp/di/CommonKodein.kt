package com.techery.moduleapp.di

import com.github.salomonbrys.kodein.Kodein

class CommonKodein {

    val mainActivityModules = KodeinCommonModule()

    val kodein = Kodein {
        import(mainActivityModules.mainActivityModule)
    }
}
