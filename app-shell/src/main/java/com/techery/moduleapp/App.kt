package com.techery.moduleapp

import android.app.Application
import di.common.CommonComponent
import di.common.DaggerCommonComponent

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