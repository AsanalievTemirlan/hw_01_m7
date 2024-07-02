package com.example.hw_01_m7.data.network.models.camerasModel


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
@Entity
data class CamerasBaseResponse(
    @PrimaryKey(autoGenerate = true)
    var id:Int ?= null,
    @SerializedName("data")
    val data: Data,
    @SerializedName("success")
    val success: Boolean
)

data class Data(
    @SerializedName("cameras")
    val cameras: List<Camera>,
    @SerializedName("room")
    val room: List<String>
)

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