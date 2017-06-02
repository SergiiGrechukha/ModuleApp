package com.techery.moduleapp

import android.app.Application
import routing.di.common.CommonComponent
import routing.di.common.DaggerCommonComponent

class App : Application() {

    lateinit var commonComponent: CommonComponent

    override fun onCreate() {
        super.onCreate()
        commonComponent = DaggerCommonComponent.create()
    }

    override fun getSystemService(name: String?): Any {
        if ("Dagger" == name) return commonComponent else return super.getSystemService(name)
    }

}