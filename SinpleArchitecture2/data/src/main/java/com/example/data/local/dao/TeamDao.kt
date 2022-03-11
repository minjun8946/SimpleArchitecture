package com.example.data.local.dao

import androidx.room.*
import com.example.data.local.entity.TeamRoomEntity
import com.example.domain.entity.TeamEntity

@Dao
interface TeamDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTeam(teamRoomEntity: List<TeamRoomEntity>)

    @Query("SELECT * FROM teamRoomEntity")
    suspend fun fetchTeam(): List<TeamRoomEntity>

    @Delete
    suspend fun deleteTeam(teamRoomEntity: List<TeamRoomEntity> )

}