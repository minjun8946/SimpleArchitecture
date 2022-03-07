package com.example.domain

interface ErrorHandler {

    suspend operator fun<T> invoke(p: suspend () -> T): T
}