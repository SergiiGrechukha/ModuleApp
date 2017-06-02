package com.techery.astream.di

import com.techery.core.SomethingUseful
import dagger.Module
import dagger.Provides

@Module
class StreamAModule{

    @Provides
    fun provideSomethingUseful() = SomethingUseful()
}