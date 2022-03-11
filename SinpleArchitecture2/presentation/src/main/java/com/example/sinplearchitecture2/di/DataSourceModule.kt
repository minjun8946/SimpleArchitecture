package com.example.sinplearchitecture2.di

import com.example.data.local.datasource.LocalTeamDataSource
import com.example.data.local.datasource.LocalTeamDataSourceImpl
import com.example.data.remote.datasource.RemoteTeamDataSource
import com.example.data.remote.datasource.RemoteTeamDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun provideRemoteDataSource(
        remoteTeamDataSourceImpl: RemoteTeamDataSourceImpl
    ): RemoteTeamDataSource

    @Binds
    abstract fun provideLocalDataSource(
        localTeamDataSourceImpl: LocalTeamDataSourceImpl
    ): LocalTeamDataSource
}