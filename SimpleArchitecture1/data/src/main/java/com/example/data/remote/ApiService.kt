package com.example.data.remote

import com.example.data.dto.TeamResponse
import retrofit2.http.GET

interface ApiService {

    @GET("/api/v1//teams")
    suspend fun getTeamData() : ArrayList<TeamResponse>
}