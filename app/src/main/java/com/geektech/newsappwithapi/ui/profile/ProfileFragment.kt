package com.geektech.newsappwithapi.ui.profile

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.geektech.newsappwithapi.base.BaseFragment
import com.geektech.newsappwithapi.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment<FragmentProfileBinding, ProfileViewModel>() {
    override val viewModel: ProfileViewModel by lazy {
        ViewModelProvider(this)[ProfileViewModel::class.java]
    }

    override fun initViewBinding(layoutInflater: LayoutInflater): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(layoutInflater)
    }

    override fun initOnViewCreated() {

    }

    override fun initCreateView() {

    }

}