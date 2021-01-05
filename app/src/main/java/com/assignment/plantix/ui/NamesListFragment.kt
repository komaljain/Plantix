package com.assignment.plantix.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.assignment.plantix.R
import com.assignment.plantix.domain.NamesListUseCase
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*
import timber.log.Timber
import javax.inject.Inject

@AndroidEntryPoint
class NamesListFragment @Inject constructor()
    : Fragment(R.layout.fragment_main) {

    private lateinit var namesListAdapter: NamesListAdapter

    private val namesListViewModel: NamesListViewModel by viewModels()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        namesListAdapter = NamesListAdapter()

        namesList.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(activity)
            adapter = namesListAdapter
        }
        namesListViewModel.names.observe(viewLifecycleOwner, Observer { list ->
            namesListAdapter.submitList(list)
        })
    }


}