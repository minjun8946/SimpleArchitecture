package com.example.data.remote.datasource

import com.example.data.dto.TeamResponse

interface DataSource {

    suspend fun getTeamData() : List<TeamResponse>
}