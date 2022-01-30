package com.example.data.remote.datasource

import com.example.data.remote.dto.TeamResponse
import kotlinx.coroutines.Job

interface TeamDataSource {

    suspend fun getTeam(): TeamResponse

}