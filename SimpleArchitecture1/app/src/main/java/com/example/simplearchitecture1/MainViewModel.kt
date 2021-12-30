package com.example.simplearchitecture1

import androidx.lifecycle.viewModelScope
import com.example.domain.usecase.GetTeamUseCase
import com.example.simplearchitecture1.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getTeamUseCase: GetTeamUseCase
): BaseViewModel(){

    fun getTeam(){
        viewModelScope.launch {
            try {
                getTeamUseCase.create(Unit).collect {
                    println(it)
                }
            }catch(e : Throwable){
                println(e)
            }
        }
    }
}