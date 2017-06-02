package com.techery.core

import javax.inject.Inject

class SomethingUseful @Inject constructor(){
    fun getSomethingUseful() = SomethingUseful::class.simpleName
}