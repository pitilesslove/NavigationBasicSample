package com.example.navigationbasicsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationbasicsample.databinding.FragmentGameOverBinding

class GameOver : Fragment() {

    lateinit var binding : FragmentGameOverBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentGameOverBinding.inflate(inflater)
        binding.playBtn4.setOnClickListener {
            it.findNavController().navigate(R.id.action_game_over_to_match)
        }
        return view
    }
}