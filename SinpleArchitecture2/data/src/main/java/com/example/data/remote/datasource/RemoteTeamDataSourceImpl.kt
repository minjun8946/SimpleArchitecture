package com.example.data.remote.datasource

import com.example.data.remote.api.TeamApi
import com.example.data.remote.dto.toEntity
import com.example.domain.ErrorHandler
import com.example.domain.entity.TeamEntity
import javax.inject.Inject

class RemoteTeamDataSourceImpl @Inject constructor(
    private val teamApi: TeamApi,
    private val errorHandler: ErrorHandler
) : RemoteTeamDataSource {

    override suspend fun fetchTeam(): TeamEntity =
        errorHandler { teamApi.getTeam().toEntity() }
}