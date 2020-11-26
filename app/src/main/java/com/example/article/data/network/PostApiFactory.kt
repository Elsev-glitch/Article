package com.example.article.data.network

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//const val API_KEY = "123"
object PostApiFactory {
//    Если бы использовал ключ апи
//    private val postInterceptor = Interceptor{chain ->
//        val newUrl = chain.request()
//            .url()
//            .newBuilder()
//            .addQueryParameter("api_key", API_KEY)
//            .build()
//        val newRequest = chain.request()
//            .newBuilder()
//            .url(newUrl)
//            .build()
//        chain.proceed(newRequest)
//    }
//
//    private val okHttpClient = OkHttpClient.Builder()
//        .addInterceptor(postInterceptor)
//        .build()

    private fun retrofit():Retrofit = Retrofit.Builder()
//        .client(okHttpClient)
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()

    val postApi:PostApi = retrofit().create(PostApi::class.java)
}