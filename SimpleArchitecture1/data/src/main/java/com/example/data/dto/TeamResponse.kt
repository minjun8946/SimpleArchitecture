package com.example.data.dto

import com.example.domain.data.Team

data class TeamResponse(
    val teamId : Int
)

fun TeamResponse.toTeam() : Team {
    return Team(teamId = teamId)
}