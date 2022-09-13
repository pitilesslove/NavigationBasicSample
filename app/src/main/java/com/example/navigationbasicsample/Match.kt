package com.example.navigationbasicsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationbasicsample.databinding.FragmentMatchBinding

class Match: Fragment() {

    lateinit var binding : FragmentMatchBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentMatchBinding.inflate(inflater)

        binding.playBtn3.setOnClickListener {
            it.findNavController().navigate(R.id.action_match_to_in_game)
        }
        return binding.root
    }
}