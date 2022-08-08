package com.geektech.newsappwithapi.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.switchMap
import com.geektech.newsappwithapi.base.BaseViewModel
import com.geektech.newsappwithapi.data.model.NewsArticle
import com.geektech.newsappwithapi.network.repo.Repository

class HomeViewModel(private val repo: Repository) : BaseViewModel() {

    private val _news = MutableLiveData<NewsArticle>()

    private val _result = MutableLiveData<Boolean>()

    val news = _result.switchMap {
        repo.getNews()
    }

    fun getNews() {
        _result.value = true
    }

}