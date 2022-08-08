package com.geektech.newsappwithapi.ui.search

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.geektech.newsappwithapi.base.BaseFragment
import com.geektech.newsappwithapi.databinding.FragmentSearchBinding

class SearchFragment : BaseFragment<FragmentSearchBinding, SearchViewModel>() {
    override val viewModel: SearchViewModel by lazy {
        ViewModelProvider(this)[SearchViewModel::class.java]
    }

    override fun initViewBinding(layoutInflater: LayoutInflater): FragmentSearchBinding {
        return FragmentSearchBinding.inflate(layoutInflater)
    }

    override fun initOnViewCreated() {

    }

    override fun initCreateView() {

    }

}