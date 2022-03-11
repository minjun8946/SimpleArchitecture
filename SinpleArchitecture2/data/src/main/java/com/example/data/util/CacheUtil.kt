package com.example.data.util

import com.example.domain.base.CacheType
import com.example.domain.base.CacheType.Type.*
import com.example.domain.entity.TeamEntity
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class CacheUtil<T> {
    private lateinit var remoteDataSource: suspend () -> T

    private lateinit var localDataSource: suspend () -> T

    private lateinit var insertRoom: suspend (T) -> Unit

    fun localDataSource(localDataSource: suspend () -> T) =
        this.apply { this@CacheUtil.localDataSource = localDataSource }

    fun remoteDataSource(remoteDataSource: suspend () -> T) =
        this.apply { this@CacheUtil.remoteDataSource = remoteDataSource }

    fun insertRoom(insertRoom: suspend (T) -> Unit) =
        this.apply { this@CacheUtil.insertRoom = insertRoom }

    suspend fun cacheType(type: CacheType): Flow<T> {
        flow { emit(localDataSource.invoke()) }
        return when (type.CacheType) {
            ALWAYS,null -> always()
            NEVER -> never()
            COMPARE -> cache()
            ONES -> ones()
        }
    }

    private suspend fun ones(): Flow<T>{
        return if (localDataSource.invoke() != null)
            flow { emit(localDataSource.invoke()) }
        else {
            insertRoom(remoteDataSource.invoke())
            return flow { emit(remoteDataSource.invoke()) }
        }
    }

    private suspend fun always(): Flow<T> {
        insertRoom(remoteDataSource.invoke())
        return flow { emit(localDataSource.invoke()) }
    }

    private suspend fun never(): Flow<T>{
        return flow { remoteDataSource.invoke() }
    }

    private suspend fun cache(): Flow<T> {
        return if (remoteDataSource.invoke() == localDataSource.invoke()) {
            insertRoom(localDataSource.invoke())
            flow { emit(localDataSource.invoke()) }
        } else {
            insertRoom(remoteDataSource.invoke())
            flow { emit(remoteDataSource.invoke()) }
        }
    }

}