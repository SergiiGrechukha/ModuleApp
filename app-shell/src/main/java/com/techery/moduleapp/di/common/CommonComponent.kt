package com.techery.moduleapp.di.common

import com.techery.moduleapp.App
import com.techery.moduleapp.di.sub.ShellComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(CommonModule::class))
interface CommonComponent {
    fun inject(app: App)
    fun shellSubComponent(): ShellComponent.Builder
}