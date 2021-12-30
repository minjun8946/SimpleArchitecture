package com.example.simplearchitecture1.di

import com.example.data.remote.repository.RepositoryImpl
import com.example.domain.repository.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(
        repository: RepositoryImpl
    ) : Repository

}