package com.example.data.remote.api

import com.example.data.remote.dto.TeamResponse
import retrofit2.Response
import retrofit2.http.GET

interface TeamApi {

    @GET("api/v1/teams")
    suspend fun getTeam(): TeamResponse
}