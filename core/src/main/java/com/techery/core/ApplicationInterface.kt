package com.techery.core

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.conf.ConfigurableKodein

interface ApplicationInterface {

    fun getSomeKodein(): ConfigurableKodein

    fun setSomeKodein(kodein: ConfigurableKodein)

    fun addModule(module: Kodein.Module)
}