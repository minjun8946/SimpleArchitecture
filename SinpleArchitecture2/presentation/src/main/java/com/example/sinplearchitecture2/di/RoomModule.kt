package com.example.sinplearchitecture2.di

import android.content.Context
import androidx.room.Room
import com.example.data.local.dao.TeamDao
import com.example.data.local.database.TeamDataBase
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    fun providesMoshi(): Moshi {
        return Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }

    @Provides
    fun provideTeamDataBase(
        @ApplicationContext context: Context): TeamDataBase = Room
        .databaseBuilder(context, TeamDataBase::class.java, "TeamDataBase")
        .build()

    @Provides
    fun provideTeamDao(
        teamDataBase: TeamDataBase
    ): TeamDao = teamDataBase.teamDao()
}