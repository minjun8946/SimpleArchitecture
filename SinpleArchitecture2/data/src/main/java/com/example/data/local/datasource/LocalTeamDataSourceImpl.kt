package com.example.data.local.datasource

import com.example.data.local.dao.TeamDao
import com.example.data.local.entity.TeamRoomEntity
import com.example.data.local.entity.toEntity
import com.example.domain.entity.TeamEntity
import javax.inject.Inject

class LocalTeamDataSourceImpl @Inject constructor(
    private val teamDao: TeamDao
): LocalTeamDataSource {
    override suspend fun insertTeam(teamEntity: TeamEntity){
        teamDao.insertTeam(teamEntity.teamData.map { it.toEntity() })
    }

    override suspend fun fetchTeam(): List<TeamRoomEntity> =
        teamDao.fetchTeam()

    override suspend fun deleteTeam(teamEntity: TeamEntity) {
        teamDao.deleteTeam(teamEntity.teamData.map { it.toEntity() })
    }
}