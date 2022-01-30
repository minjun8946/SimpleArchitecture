package com.example.data.remote.dto

import com.google.gson.annotations.SerializedName

data class TeamResponse(
    @SerializedName("data") val teamData: List<TeamData>
){
    data class TeamData(
        @SerializedName("id") val id: Int,
        @SerializedName("abbreviation") val abbreviation: String,
        @SerializedName("city") val city: String,
        @SerializedName("conference") val conference: String,
        @SerializedName("division") val division: String,
        @SerializedName("full_name") val fullName : String,
        @SerializedName("name") val name : String
    )
}
