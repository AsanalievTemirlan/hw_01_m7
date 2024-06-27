package com.example.hw_01_m7.data.network.models.doorsModel


import com.google.gson.annotations.SerializedName

data class DoorsBaseResponse(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("success")
    val success: Boolean
)