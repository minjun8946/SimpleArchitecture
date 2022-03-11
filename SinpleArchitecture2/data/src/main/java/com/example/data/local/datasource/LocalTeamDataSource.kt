package com.example.data.local.datasource

import com.example.data.local.entity.TeamRoomEntity
import com.example.domain.entity.TeamEntity

interface LocalTeamDataSource {

    suspend fun insertTeam(teamEntity: TeamEntity)

    suspend fun fetchTeam(): List<TeamRoomEntity>

    suspend fun deleteTeam(teamEntity: TeamEntity)
}