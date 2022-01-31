package com.example.domain.entity

data class TeamEntity(
    val teamData: List<Team>
){
    data class Team(
        val id: Int,
        val abbreviation: String,
        val city: String,
        val conference: String,
        val division: String,
        val fullName : String,
        val name : String
    )
}