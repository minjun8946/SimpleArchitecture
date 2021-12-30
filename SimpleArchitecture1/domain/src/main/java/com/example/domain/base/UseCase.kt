package com.example.domain.base

import kotlinx.coroutines.flow.Flow

abstract class UseCase<T,E>(){
    abstract suspend fun create(data : T) : Flow<E>
}