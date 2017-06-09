package di.common

import com.github.salomonbrys.kodein.Kodein.Module
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.techery.moduleapp.routing.Router
import routing.StreamRouting

class KodeinCommonModule {
    val mainActivityModule = Module {
        bind<Router>() with instance(StreamRouting())
    }
}