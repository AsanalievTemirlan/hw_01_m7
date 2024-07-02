package com.example.hw_01_m7.data.network.apiService

import com.example.hw_01_m7.data.network.models.camerasModel.CamerasBaseResponse
import com.example.hw_01_m7.data.network.models.doorsModel.DoorsBaseResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("cameras/")
    suspend fun getCameras() : CamerasBaseResponse

    @GET("doors/")
    suspend fun getDoors() : DoorsBaseResponse
}