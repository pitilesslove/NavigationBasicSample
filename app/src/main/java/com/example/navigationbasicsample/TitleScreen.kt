package com.example.navigationbasicsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationbasicsample.databinding.FragmentTitleScreenBinding

class TitleScreen : Fragment() {

    private lateinit var binding: FragmentTitleScreenBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTitleScreenBinding.inflate(inflater)

        binding.playBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_title_screen_to_register)
        }
        binding.leaderboardBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_title_screen_to_leaderboard)
        }

        return binding.root
    }
}