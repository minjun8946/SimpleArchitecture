package com.example.data.remote.datasource

import com.example.data.remote.dto.TeamResponse
import com.example.domain.entity.TeamEntity

interface RemoteTeamDataSource {

    suspend fun fetchTeam(): TeamEntity
}