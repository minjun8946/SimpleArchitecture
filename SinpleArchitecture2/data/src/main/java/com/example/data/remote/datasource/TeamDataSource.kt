package com.example.data.remote.datasource

import com.example.data.remote.dto.TeamResponse

interface TeamDataSource {

    suspend fun getTeam(): TeamResponse

}