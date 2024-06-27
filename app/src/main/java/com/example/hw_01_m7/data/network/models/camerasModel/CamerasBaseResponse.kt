package com.example.hw_01_m7.data.network.models.camerasModel


import com.google.gson.annotations.SerializedName

data class CamerasBaseResponse(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("success")
    val success: Boolean
)