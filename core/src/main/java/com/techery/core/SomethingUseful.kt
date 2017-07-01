package com.techery.core

import javax.inject.Inject

open class SomethingUseful @Inject constructor() {
    fun getSomethingUseful() = SomethingUseful::class.simpleName
}