package com.geektech.newsappwithapi.ui.home

import android.util.Log
import android.view.LayoutInflater
import com.geektech.newsappwithapi.base.BaseFragment
import com.geektech.newsappwithapi.databinding.FragmentHomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override val viewModel: HomeViewModel by viewModel()

    override fun initViewBinding(layoutInflater: LayoutInflater): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun initOnViewCreated() {
        viewModel.getNews()
        viewModel.news.observe(viewLifecycleOwner) {
            Log.e("ololo", it.toString())
        }
    }

    override fun initCreateView() {

    }
}