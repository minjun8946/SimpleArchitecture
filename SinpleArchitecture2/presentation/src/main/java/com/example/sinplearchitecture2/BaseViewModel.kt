package com.example.sinplearchitecture2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.base.UseCase
import com.example.domain.usccase.TeamUseCase
import kotlinx.coroutines.launch
import java.lang.Exception
import java.util.*

open class BaseViewModel : ViewModel(){

    suspend fun<T: UseCase,E> getApiResult(useCase: suspend () -> E):E {
            return try {
                useCase.invoke()
            }catch (e: Exception){
                throw e
            }
    }

}