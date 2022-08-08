package com.geektech.newsappwithapi.di

import com.geektech.newsappwithapi.ui.home.HomeViewModel
import com.geektech.newsappwithapi.ui.profile.ProfileViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { ProfileViewModel(get()) }
}