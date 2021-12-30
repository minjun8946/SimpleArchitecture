package com.example.data.remote.repository

import com.example.data.OfflineCacheUtil
import com.example.data.dto.toTeam
import com.example.data.remote.datasource.DataSource
import com.example.domain.data.Team
import com.example.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val dataSource : DataSource
) : Repository {
    override suspend fun getTeamData(): Flow<List<Team>> =
        OfflineCacheUtil<List<Team>>()
            .remoteData { dataSource.getTeamData().map { it.toTeam() } }
            .createFlow()

}