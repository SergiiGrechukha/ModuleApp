package com.loki.core

import com.github.salomonbrys.kodein.Kodein

interface ApplicationInterface {

    fun addModule(module: Kodein.Module)
}