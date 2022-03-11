package com.example.data.local.database

import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.data.local.entity.TeamRoomEntity
import com.example.data.local.dao.TeamDao

@Database(entities = [TeamRoomEntity::class], version = 1, exportSchema = false)

abstract class TeamDataBase: RoomDatabase() {
    abstract fun teamDao(): TeamDao
}