package com.example.data.errorhandler

import com.example.domain.base.RuntimeException
import retrofit2.HttpException
import java.util.concurrent.TimeoutException

class ErrorHandler<T> {

    lateinit var httpRequest: suspend () -> T

    fun httpRequest(httpRequest: suspend () -> T) =
        this.apply { this.httpRequest = httpRequest }

    suspend fun errorHandler(): T {

        return try {
            httpRequest()
        } catch (e: HttpException) {
            throw when (e.code()) {
                404 -> RuntimeException()

                else -> {
                    TimeoutException()
                }
            }
        }
    }
}



