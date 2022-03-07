package com.example.domain.base

abstract class UseCase{
    abstract suspend fun<I, O> execute(data: I): O
}