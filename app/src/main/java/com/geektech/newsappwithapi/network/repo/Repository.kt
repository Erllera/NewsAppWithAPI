package com.geektech.newsappwithapi.network.repo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.geektech.newsappwithapi.data.model.NewsArticle
import com.geektech.newsappwithapi.network.NewsApi
import kotlinx.coroutines.Dispatchers

class Repository(private val newsApi: NewsApi) {

    fun getNews(): LiveData<NewsArticle?> = liveData(Dispatchers.IO) {
        val result = newsApi.getLoveApi()
        if (result.isSuccessful) {
            Log.e("ololo", result.body().toString())
        } else {
            result.errorBody()?.string()?.let { Log.e("ololo", it) }
        }
    }
}