package com.example.navigationbasicsample

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationbasicsample.databinding.FragmentLeaderboardBinding
import com.example.navigationbasicsample.databinding.ListViewItemBinding

class LeaderBoard : Fragment() {


    private lateinit var binding: FragmentLeaderboardBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentLeaderboardBinding.inflate(inflater)

        val viewAdapter = MyAdapter(arrayOf("Flo", "Ly", "Jo"))

        binding.leaderboardList.run {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter
        }
        return binding.root
    }

}

class MyAdapter(private val myDataset: Array<String>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    private lateinit var binding: ListViewItemBinding


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class ViewHolder(val binding: ListViewItemBinding) : RecyclerView.ViewHolder(binding.root)


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {

        binding = ListViewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.binding.userNameText.text = myDataset[position]
        holder.binding.userAvatarImage.setImageResource(listOfAvatars[position])
        holder.binding.root.setOnClickListener {
            Log.i("LeaderBoard", "on Clicked =$it")
            val bundle = bundleOf("userName" to myDataset[position])

            it.findNavController().navigate(
                R.id.action_leaderboard_to_userProfile,
                bundle)
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size
}

private val listOfAvatars = listOf(
    R.drawable.avatar_1_raster, R.drawable.avatar_2_raster, R.drawable.avatar_3_raster)