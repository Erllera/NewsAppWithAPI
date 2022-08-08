package com.geektech.newsappwithapi.network

import com.geektech.newsappwithapi.BuildConfig
import com.geektech.newsappwithapi.data.model.NewsArticle
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

//base url https://newsapi.org/v2/
interface NewsApi {
    @GET("top-headlines")
    suspend fun getLoveApi(
        @Query("apiKey") apiKey: String = BuildConfig.API_KEY,
        @Query("country") country: String = "ru",
        @Query("category") category: String = "business"
    ): Response<NewsArticle>
}