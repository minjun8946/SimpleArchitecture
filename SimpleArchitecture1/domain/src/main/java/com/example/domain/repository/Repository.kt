package com.example.domain.repository

import com.example.domain.data.Team
import kotlinx.coroutines.flow.Flow


interface Repository {
    suspend fun getTeamData() : Flow<List<Team>>
}