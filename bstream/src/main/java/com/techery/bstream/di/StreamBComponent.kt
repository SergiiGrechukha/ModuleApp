package com.techery.bstream.di

import com.techery.bstream.BStreamActivity
import dagger.Subcomponent

@StreamBScope
@Subcomponent(modules = arrayOf(StreamBModule::class))
interface StreamBComponent {
    fun inject(activity: BStreamActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): StreamBComponent
    }
}