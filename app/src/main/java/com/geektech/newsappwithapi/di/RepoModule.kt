package com.geektech.newsappwithapi.di

import com.geektech.newsappwithapi.network.repo.Repository
import org.koin.dsl.module

val repoModule = module {
    single { Repository(get()) }
}