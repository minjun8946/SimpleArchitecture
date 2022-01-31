package com.example.domain.usccase

import com.example.domain.entity.TeamEntity
import com.example.domain.repository.TeamRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TeamUseCase @Inject constructor(
    private val teamRepository: TeamRepository
) {
    suspend operator fun invoke(): Flow<TeamEntity>{
        return teamRepository.getTeam()
    }
}