package com.techery.moduleapp

import android.app.Application
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.KodeinAware
import com.github.salomonbrys.kodein.lazy
import di.common.CommonComponent
import di.common.DaggerCommonComponent
import di.common.KodeinCommonModule

class App : Application(), KodeinAware {

    override val kodein by Kodein.lazy {
        import(KodeinCommonModule().mainActivityModule)
    }

    lateinit var commonComponent: CommonComponent

    override fun onCreate() {
        super.onCreate()
        commonComponent = DaggerCommonComponent.create()
    }

    override fun getSystemService(name: String?): Any {
        if ("Dagger" == name) return commonComponent else return super.getSystemService(name)
    }

}