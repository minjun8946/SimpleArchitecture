package com.example.simplearchitecture1.di

import com.example.data.remote.datasource.DataSource
import com.example.data.remote.datasource.DataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun provideDataSource(
        dataSourceImpl: DataSourceImpl
    ) : DataSource

}