package com.example.data.remote.datasource

import com.example.data.remote.api.TeamApi
import com.example.data.remote.dto.TeamResponse
import com.example.domain.ErrorHandler
import java.lang.Exception
import javax.inject.Inject

class TeamDataSourceImpl @Inject constructor(
    private val teamApi: TeamApi,
    private val errorHandler: ErrorHandler
) : TeamDataSource {
    override suspend fun getTeam(): TeamResponse =
        errorHandler { teamApi.getTeam() }
}