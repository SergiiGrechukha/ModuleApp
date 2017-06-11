package com.techery.core

import android.app.Application
import android.content.Context
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.KodeinAware
import com.github.salomonbrys.kodein.conf.ConfigurableKodein

open class App : Application(), ApplicationInterface, KodeinAware {

    val tempKodein = ConfigurableKodein(mutable = true)

    override fun addModule(module: Kodein.Module) {
        tempKodein.clear()
        tempKodein.addImport(module)
        kodein.addExtend(tempKodein)
    }

    override fun setSomeKodein(kodein: ConfigurableKodein) {
        this.kodein = kodein
    }

    override fun getSomeKodein(): ConfigurableKodein {
        return this.kodein
    }

    override var kodein = ConfigurableKodein(mutable = true)


    override fun getSystemService(name: String?): Any {
        when (name) {
            "Kodein" -> return kodein
            else -> return super.getSystemService(name)
        }
    }



}

fun Context.iNeedSomeKodein() = (applicationContext as App).kodein
