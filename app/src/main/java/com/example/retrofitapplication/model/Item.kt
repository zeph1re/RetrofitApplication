package com.example.retrofitapplication.model

import java.io.Serializable

data class Item(
    val UpdateCategory: List<Any>,
    val appName: String,
    val developerUpdateDate: String,
    val genreId: String,
    val id: String,
    val outOfDateBy: Int,
    val packageName: String,
    val releaseAge: Int,
    val releaseNotes: String
)