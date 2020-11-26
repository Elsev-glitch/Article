package com.example.article.data.entity


import java.io.Serializable

data class PostItem(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
):Serializable