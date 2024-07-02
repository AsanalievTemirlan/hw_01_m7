package com.example.hw_01_m7.data.local

import androidx.room.TypeConverter
import com.example.hw_01_m7.data.network.models.camerasModel.Camera
import com.example.hw_01_m7.data.network.models.camerasModel.Data
import com.example.hw_01_m7.data.network.models.doorsModel.Doors
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converter {

    @TypeConverter
    fun fromData(data: Data): String {
        return Gson().toJson(data)
    }

    @TypeConverter
    fun toData(dataString: String): Data {
        val type = object : TypeToken<Data>() {}.type
        return Gson().fromJson(dataString, type)
    }

    @TypeConverter
    fun fromCameraList(cameras: List<Camera>): String {
        return Gson().toJson(cameras)
    }

    @TypeConverter
    fun toCameraList(camerasString: String): List<Camera> {
        val type = object : TypeToken<List<Camera>>() {}.type
        return Gson().fromJson(camerasString, type)
    }

    @TypeConverter
    fun fromStringList(strings: List<String>): String {
        return Gson().toJson(strings)
    }

    @TypeConverter
    fun toStringList(stringsString: String): List<String> {
        val type = object : TypeToken<List<String>>() {}.type
        return Gson().fromJson(stringsString, type)
    }
    @TypeConverter
    fun fromDoorsList(doors: List<Doors>): String {
        return Gson().toJson(doors)
    }

    @TypeConverter
    fun toDoorsList(doorsString: String): List<Doors> {
        val type = object : TypeToken<List<Doors>>() {}.type
        return Gson().fromJson(doorsString, type)
    }
}
