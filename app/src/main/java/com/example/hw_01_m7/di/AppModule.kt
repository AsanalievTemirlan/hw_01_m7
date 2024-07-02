package com.example.hw_01_m7.di

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.example.hw_01_m7.data.local.dao.Dao
import com.example.hw_01_m7.data.local.db.DataBase
import com.example.hw_01_m7.data.network.apiService.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule  {


    @Singleton
    @Provides
    fun provideRoomDataBase(@ApplicationContext context: Context): DataBase =
        Room.databaseBuilder(context, DataBase::class.java, "DataBase").allowMainThreadQueries().build()

    @Provides
    fun provideDao(dataBase: DataBase): Dao {
        return dataBase.getCamera()
    }
    @Provides
    fun provideRetrofitService(): ApiService {
        return Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiService::class.java)
    }
}