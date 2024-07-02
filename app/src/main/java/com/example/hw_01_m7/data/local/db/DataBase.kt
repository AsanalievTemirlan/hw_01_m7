package com.example.hw_01_m7.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.hw_01_m7.data.local.Converter
import com.example.hw_01_m7.data.local.dao.Dao
import com.example.hw_01_m7.data.local.entity.CameraEntity
import com.example.hw_01_m7.data.local.entity.DoorEntity
import com.example.hw_01_m7.data.network.models.camerasModel.CamerasBaseResponse
import com.example.hw_01_m7.data.network.models.doorsModel.DoorsBaseResponse

@Database(entities = [CameraEntity::class, DoorEntity::class,  CamerasBaseResponse::class, DoorsBaseResponse::class], version = 1)
@TypeConverters(Converter::class)
abstract class DataBase: RoomDatabase() {
    abstract fun dao(): Dao
}