package com.example.sinplearchitecture2.di

import com.example.data.repository.TeamRepositoryImpl
import com.example.domain.repository.TeamRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(
        teamRepositoryImpl: TeamRepositoryImpl
    ) : TeamRepository

}