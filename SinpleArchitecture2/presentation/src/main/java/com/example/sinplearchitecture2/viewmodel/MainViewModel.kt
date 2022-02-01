package com.example.sinplearchitecture2.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usccase.TeamUseCase
import com.example.sinplearchitecture2.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    //private val handle: SavedStateHandle,
    private val teamUseCase: TeamUseCase
) : BaseViewModel() {

    fun getTeamUseCase() {
        viewModelScope.launch {
            try {
                teamUseCase().collect {
                    println(it)
                }
            } catch (e: Throwable) {
                println(e)
            }
        }
    }

}