package com.techery.bstream.mock

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.android.androidActivityScope
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.scopedSingleton
import com.techery.core.SomethingUseful
import org.mockito.Mockito
import org.mockito.Mockito.`when`

class BStreamMockModule {

    var mockSomething: SomethingUseful = Mockito.mock(SomethingUseful::class.java)

    val mockModule = Kodein.Module{

        bind<SomethingUseful>() with scopedSingleton(androidActivityScope) {
            MockSomethingUseful()
        }
    }

//    init {
//        `when`(mockSomething.getSomethingUseful()).`thenReturn`("I am mock")
//    }
}

class MockSomethingUseful: SomethingUseful() {
    override fun getSomethingUseful() = "I am mock"
}