package com.example.hw_01_m7.data.network.models.camerasModel


import com.google.gson.annotations.SerializedName

data class Camera(
    @SerializedName("favorites")
    val favorites: Boolean,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("rec")
    val rec: Boolean,
    @SerializedName("room")
    val room: String,
    @SerializedName("snapshot")
    val snapshot: String
)