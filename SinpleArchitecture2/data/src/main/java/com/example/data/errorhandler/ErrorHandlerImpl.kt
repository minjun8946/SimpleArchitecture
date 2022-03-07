package com.example.data.errorhandler

import com.example.domain.ErrorHandler
import com.example.domain.base.NotFound
import com.example.domain.base.Unknown
import retrofit2.HttpException
import javax.inject.Inject

class ErrorHandlerImpl @Inject constructor() : ErrorHandler {

    override suspend fun <T> invoke(p: suspend () -> T): T {
        return try {
            p.invoke()
        } catch (e: Throwable) {
            if (e is HttpException) {
                when (e.code()) {
                    404 -> throw NotFound(e.message())
                    else -> throw Unknown()
                }
            }
            else{
                throw Unknown()
            }
        }
    }
}