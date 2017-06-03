package com.techery.moduleapp.di.sub

import com.techery.moduleapp.MainActivity
import com.techery.moduleapp.di.ViewScope
import dagger.Subcomponent

@ViewScope
@Subcomponent(modules = arrayOf(ShellModule::class))
interface ShellComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): ShellComponent
    }

    fun inject(activity: MainActivity)

}