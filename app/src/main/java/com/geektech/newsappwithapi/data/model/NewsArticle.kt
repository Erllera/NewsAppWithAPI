package com.geektech.newsappwithapi.data.model

data class NewsArticle(
    val articles: List<Article>,
    val status: String, // ok
    val totalResults: Int // 17
)