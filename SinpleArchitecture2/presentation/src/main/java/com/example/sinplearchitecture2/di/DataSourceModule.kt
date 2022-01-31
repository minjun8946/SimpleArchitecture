package com.example.sinplearchitecture2.di

import com.example.data.remote.datasource.TeamDataSource
import com.example.data.remote.datasource.TeamDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun provideDataSource(
        teamDataSourceImpl: TeamDataSourceImpl
    ) : TeamDataSource

}