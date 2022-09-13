package com.example.navigationbasicsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationbasicsample.databinding.FragmentResultsWinnerBinding

class ResultsWinner : Fragment() {

    lateinit var binding : FragmentResultsWinnerBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentResultsWinnerBinding.inflate(inflater)
        binding.playBtn2.setOnClickListener {
            it.findNavController().navigate(R.id.action_results_winner_to_match)
        }

        binding.leaderboardBtn2.setOnClickListener {
            it.findNavController().navigate(R.id.action_results_winner_to_leaderboard)
        }
        return binding.root
    }
}