package com.example.udacitycode

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.udacitycode.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {
    private lateinit var binding: FragmentTitleBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
         binding = DataBindingUtil.inflate(inflater,R.layout.fragment_title,container,false)

        binding.playButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(TitleFragmentDirections.actionTitleFragmentToGameFragment())
        )
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController()) || super.onOptionsItemSelected(item)

    }
}