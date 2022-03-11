package com.example.sinplearchitecture2.di

import com.example.data.util.ErrorHandlerImpl
import com.example.domain.ErrorHandler
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)

abstract class ErrorHandlerModule {

    @Binds
    abstract fun provideErrorHandler(
        errorHandlerImpl: ErrorHandlerImpl
    ): ErrorHandler
}