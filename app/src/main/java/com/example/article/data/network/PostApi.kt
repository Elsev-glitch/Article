package com.example.article.data.network

import com.example.article.data.entity.PostItem
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface PostApi {
    @GET("posts")
    fun getPosts(): Deferred<Response<List<PostItem>>>
}