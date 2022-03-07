package com.example.domain.repository

import com.example.domain.entity.TeamEntity
import kotlinx.coroutines.flow.Flow

interface TeamRepository {

    suspend fun getTeam(): Flow<TeamEntity>
}