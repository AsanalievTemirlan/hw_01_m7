package com.example.hw_01_m7.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "camera")
data class CameraEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val count: Int,
)
