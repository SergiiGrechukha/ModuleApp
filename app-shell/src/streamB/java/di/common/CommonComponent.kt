package di.common

import com.techery.bstream.di.StreamBCommon
import com.techery.moduleapp.App
import com.techery.moduleapp.di.sub.ShellComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(CommonModule::class))
interface CommonComponent : StreamBCommon {
    fun inject(app: App)
    fun shellSubComponent(): ShellComponent.Builder
}