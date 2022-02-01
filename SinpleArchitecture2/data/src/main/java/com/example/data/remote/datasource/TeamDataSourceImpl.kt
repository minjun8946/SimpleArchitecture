package com.example.data.remote.datasource

import com.example.data.errorhandler.ErrorHandler
import com.example.data.remote.api.TeamApi
import com.example.data.remote.dto.TeamResponse
import kotlinx.coroutines.DelicateCoroutinesApi
import javax.inject.Inject

class TeamDataSourceImpl @Inject constructor(
    private val teamApi: TeamApi,
) : TeamDataSource {
    @DelicateCoroutinesApi
    override suspend fun getTeam(): TeamResponse {
        return ErrorHandler<TeamResponse>()
            .httpRequest { teamApi.getTeam() }
            .errorHandler()
    }

}