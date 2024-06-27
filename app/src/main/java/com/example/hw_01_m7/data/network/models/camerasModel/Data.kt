package com.example.hw_01_m7.data.network.models.camerasModel


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("cameras")
    val cameras: List<Camera>,
    @SerializedName("room")
    val room: List<String>
)