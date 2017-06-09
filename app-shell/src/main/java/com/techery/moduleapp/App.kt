package com.techery.moduleapp

import android.app.Application
import android.content.Context
import com.github.salomonbrys.kodein.KodeinAware
import com.github.salomonbrys.kodein.conf.ConfigurableKodein

class App : Application(), KodeinAware {

    override val kodein = ConfigurableKodein(mutable = true)


    override fun getSystemService(name: String?): Any {
        when(name) {
            "Kodein" -> return kodein
            else -> return super.getSystemService(name)
        }
    }

}

fun Context.iNeedSomeKodein() = (applicationContext as App).kodein