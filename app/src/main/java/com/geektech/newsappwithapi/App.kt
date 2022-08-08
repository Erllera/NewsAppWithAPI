package com.geektech.newsappwithapi

import android.app.Application
import com.geektech.newsappwithapi.di.repoModule
import com.geektech.newsappwithapi.di.viewModule
import com.geektech.newsappwithapi.network.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(networkModule, repoModule, viewModule))
        }
    }
}