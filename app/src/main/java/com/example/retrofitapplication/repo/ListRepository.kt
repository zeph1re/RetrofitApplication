package com.example.retrofitapplication.repo

import com.example.retrofitapplication.model.AppItem
import com.example.retrofitapplication.model.Item
import com.example.retrofitapplication.network.ApiService
import javax.inject.Inject

class ListRepository @Inject constructor(private val apiService: ApiService){

    suspend fun getList() : List<Item> {
       return apiService.getList()
    }
}
