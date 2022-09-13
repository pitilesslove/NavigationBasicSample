package com.example.navigationbasicsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationbasicsample.databinding.FragmentUserProfileBinding

class UserProfile : Fragment() {

    lateinit var binding : FragmentUserProfileBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentUserProfileBinding.inflate(inflater)
        val name = arguments?.getString("userName") ?: "Ali Connors"
        binding.profileUserName.text = name
        return binding.root
    }
}