package com.example.hw_01_m7.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.hw_01_m7.data.network.models.camerasModel.CamerasBaseResponse
import com.example.hw_01_m7.data.network.models.doorsModel.DoorsBaseResponse


@Dao
interface Dao {

    @Insert
    fun loadCamera(model: CamerasBaseResponse)

    @Insert
    fun loadDoor(model: DoorsBaseResponse)

    @Query("SELECT COUNT(*) FROM camera")
    fun getCamera():Int

    @Query("SELECT COUNT(*) FROM door")
    fun getDoor():Int
}