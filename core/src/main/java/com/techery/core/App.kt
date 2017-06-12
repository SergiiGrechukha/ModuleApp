package com.techery.core

import android.app.Application
import android.content.Context
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.KodeinAware
import com.github.salomonbrys.kodein.conf.ConfigurableKodein

open class App : Application(), ApplicationInterface, KodeinAware {

    override fun addModule(module: Kodein.Module) {
        kodein.addConfig { import(module, true) }
    }

    override var kodein = ConfigurableKodein(mutable = true)

    override fun getSystemService(name: String?): Any {
        when (name) {
            "Kodein" -> return kodein
            else -> return super.getSystemService(name)
        }
    }
}

fun Context.asApp() = applicationContext as App

fun Context.iNeedSomeKodein() = this.asApp().kodein

infix fun Context.addModule(module: Kodein.Module) = this.asApp().addModule(module)
