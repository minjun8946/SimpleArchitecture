package com.example.domain.repository

import com.example.domain.base.CacheType
import com.example.domain.entity.TeamEntity
import kotlinx.coroutines.flow.Flow

interface TeamRepository {

    suspend fun fetchTeam(): Flow<TeamEntity>

    suspend fun delete(teamEntity: TeamEntity)
}