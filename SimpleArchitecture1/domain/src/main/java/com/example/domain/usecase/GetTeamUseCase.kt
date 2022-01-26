package com.example.domain.usecase

import com.example.domain.base.UseCase
import com.example.domain.data.Team
import com.example.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTeamUseCase @Inject constructor(private val repository: Repository)
{
    suspend operator fun invoke(): Flow<List<Team>> =
        repository.getTeamData()
}