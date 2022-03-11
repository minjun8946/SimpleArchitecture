package com.example.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.domain.entity.TeamEntity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "teamRoomEntity")
data class TeamRoomEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val abbreviation: String,
    val city: String,
    val conference: String,
    val division: String,
    val fullName: String,
    val name: String
)

fun List<TeamRoomEntity>.toEntity() =
    TeamEntity(
        teamData = this.map { it.toEntity() }
    )

fun TeamRoomEntity.toEntity() =
    TeamEntity.Team(
        id = id,
        abbreviation = abbreviation,
        city = city,
        conference = conference,
        division = division,
        fullName = fullName,
        name = name
    )

fun TeamEntity.Team.toEntity() =
    TeamRoomEntity(
        id = id,
        abbreviation = abbreviation,
        city = city,
        conference = conference,
        division = division,
        fullName = fullName,
        name = name
    )