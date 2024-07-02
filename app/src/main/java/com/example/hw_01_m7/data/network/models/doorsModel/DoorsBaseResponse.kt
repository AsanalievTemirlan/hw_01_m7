package com.example.hw_01_m7.data.network.models.doorsModel


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class DoorsBaseResponse(
    @PrimaryKey(autoGenerate = true)
    var id:Int ?= null,
    @SerializedName("data")
    val `data`: List<Doors>,
    @SerializedName("success")
    val success: Boolean
)

data class Doors(
    @SerializedName("favorites")
    val favorites: Boolean,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("room")
    val room: String,
    @SerializedName("snapshot")
    val snapshot: String
)