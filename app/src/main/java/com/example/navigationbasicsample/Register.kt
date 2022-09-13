package com.example.navigationbasicsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationbasicsample.databinding.FragmentRegisterBinding

class Register : Fragment() {

    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentRegisterBinding.inflate(inflater)
        binding.signupBtn.setOnClickListener {
//            it.findNavController().navigate(R.id.action_register_to_match)
        }

        return binding.root
    }
}