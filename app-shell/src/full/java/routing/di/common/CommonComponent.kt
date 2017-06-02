package routing.di.common

import com.techery.astream.di.StreamACommon
import com.techery.moduleapp.App
import com.techery.moduleapp.di.sub.ShellComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(CommonModule::class))
interface CommonComponent : StreamACommon {
    fun inject(app: App)
    fun shellSubComponent(): ShellComponent.Builder

}