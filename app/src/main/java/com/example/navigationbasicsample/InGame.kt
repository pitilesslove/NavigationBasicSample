package com.example.navigationbasicsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationbasicsample.databinding.FragmentInGameBinding

class InGame : Fragment() {

    lateinit var binding : FragmentInGameBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentInGameBinding.inflate(inflater)

        val gameOverListener: (View) -> Unit = {
            it.findNavController().navigate(R.id.action_in_game_to_gameOver)
        }

        binding.checkBox.setOnClickListener(gameOverListener)
        binding.checkBox2.setOnClickListener(gameOverListener)
        binding.checkBox4.setOnClickListener(gameOverListener)
        binding.checkBox3.setOnClickListener {
            it.findNavController().navigate(R.id.action_in_game_to_resultsWinner)
        }

        return binding.root
    }
}