package com.example.data.remote.datasource

import com.example.data.errorhandler.errorHandler
import com.example.data.remote.api.TeamApi
import com.example.data.remote.dto.TeamResponse
import javax.inject.Inject

class TeamDataSourceImpl @Inject constructor(
    private val teamApi: TeamApi,
): TeamDataSource {
    override suspend fun getTeam(): TeamResponse =
         errorHandler { teamApi.getTeam() }

}