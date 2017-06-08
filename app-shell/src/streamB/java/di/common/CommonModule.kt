package di.common

import com.techery.moduleapp.routing.Router
import dagger.Module
import dagger.Provides
import routing.StreamRouting

@Module
class CommonModule {

    @Provides
    fun provideRouter(): Router {
        return StreamRouting()
    }
}