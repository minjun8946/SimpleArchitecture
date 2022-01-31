package com.example.data.repository

import com.example.data.remote.datasource.TeamDataSource
import com.example.data.remote.dto.toEntity
import com.example.domain.entity.TeamEntity
import com.example.domain.repository.TeamRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class TeamRepositoryImpl @Inject constructor(
    private val teamDataSource: TeamDataSource
): TeamRepository {
    override suspend fun getTeam(): Flow<TeamEntity> {
        return flow { teamDataSource.getTeam().toEntity() }
    }
}