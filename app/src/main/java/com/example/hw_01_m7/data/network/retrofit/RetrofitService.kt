package com.example.hw_01_m7.data.network.retrofit

import com.example.hw_01_m7.data.network.apiService.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
    private var retrofit = Retrofit.Builder().baseUrl("https://cars.cprogroup.ru/api/rubetek/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val api = retrofit.create(ApiService::class.java)

}