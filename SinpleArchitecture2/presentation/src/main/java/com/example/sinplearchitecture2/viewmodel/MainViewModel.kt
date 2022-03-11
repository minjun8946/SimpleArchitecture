package com.example.sinplearchitecture2.viewmodel

import androidx.lifecycle.viewModelScope
import com.example.domain.base.NotFound
import com.example.domain.usccase.TeamUseCase
import com.example.sinplearchitecture2.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val teamUseCase: TeamUseCase,
) : BaseViewModel() {

    fun getTeamUseCase() {
        viewModelScope.launch {
            kotlin.runCatching {
                    teamUseCase().collect{
                        println(it.teamData)
                    }
            }.onFailure {
                when(it){
                    is NotFound -> println("notfound")
                }
            }
        }
    }
}