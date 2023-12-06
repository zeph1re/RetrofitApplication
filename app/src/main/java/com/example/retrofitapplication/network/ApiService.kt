package com.example.retrofitapplication.network


import com.example.retrofitapplication.model.Item
import retrofit2.http.GET

interface ApiService {

    @GET("UpdatePriority")
    suspend fun getList() : List<Item>
}