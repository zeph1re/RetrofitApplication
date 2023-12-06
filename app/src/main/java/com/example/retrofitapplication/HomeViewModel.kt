package com.example.retrofitapplication

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitapplication.model.Item
import com.example.retrofitapplication.repo.ListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel  @Inject constructor(val repo: ListRepository) : ViewModel(){

    private val listState = MutableStateFlow(emptyList<Item>())

    val dataState : StateFlow<List<Item>>
        get() = listState

    init {
        viewModelScope.launch(Dispatchers.IO) {
            val list = repo.getList()
            Log.d("list", "list : $list")
            listState.value = list
        }
    }

}
