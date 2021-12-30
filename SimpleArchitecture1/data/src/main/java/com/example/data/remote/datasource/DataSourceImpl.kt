package com.example.data.remote.datasource

import com.example.data.dto.TeamResponse
import com.example.data.remote.ApiService
import javax.inject.Inject

class DataSourceImpl @Inject constructor(
    private val apiService : ApiService,
) : DataSource {
    override suspend fun getTeamData(): List<TeamResponse> =
        apiService.getTeamData()

}