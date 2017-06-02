package com.techery.astream.di

import com.techery.astream.AStreamActivity
import dagger.Subcomponent

@StreamAScope
@Subcomponent(modules = arrayOf(StreamAModule::class))
interface StreamAComponent{

    fun inject(activity: AStreamActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build() : StreamAComponent
    }
}