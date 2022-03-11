package com.example.data.repository

import com.example.data.local.datasource.LocalTeamDataSource
import com.example.data.local.entity.toEntity
import com.example.data.remote.datasource.RemoteTeamDataSource
import com.example.data.util.CacheUtil
import com.example.domain.base.CacheType
import com.example.domain.entity.TeamEntity
import com.example.domain.repository.TeamRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TeamRepositoryImpl @Inject constructor(
    private val remoteTeamDataSource: RemoteTeamDataSource,
    private val localTeamDataSource: LocalTeamDataSource
) : TeamRepository {

    override suspend fun fetchTeam(): Flow<TeamEntity> =
       CacheUtil<TeamEntity>()
           .remoteDataSource { remoteTeamDataSource.fetchTeam() }
           .localDataSource { localTeamDataSource.fetchTeam().toEntity() }
           .insertRoom { localTeamDataSource.insertTeam(it) }
           .cacheType(CacheType(CacheType.Type.ALWAYS))

    override suspend fun delete(teamEntity: TeamEntity) {

    }
}