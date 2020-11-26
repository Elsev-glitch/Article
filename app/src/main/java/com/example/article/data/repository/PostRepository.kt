package com.example.article.data.repository

import com.example.article.data.entity.PostItem
import com.example.article.data.network.PostApi

class PostRepository(private val api: PostApi): BaseRepository() {
    suspend fun getPosts(): MutableList<PostItem>?{
        val postResponse = safeApiCall(
            call = {api.getPosts().await()},
            errorMesage = "Error Post"
        )
        return postResponse?.toMutableList()
    }
}