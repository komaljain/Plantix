package com.assignment.plantix.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.assignment.plantix.domain.entity.Names
import timber.log.Timber

class NamesListAdapter : ListAdapter<Names, RecyclerView.ViewHolder>(REPO_COMPARATOR) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return NamesListViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val names = getItem(position)
        if (names != null) {
            (holder as NamesListViewHolder).bind(names)
        }
    }

    companion object {
        private val REPO_COMPARATOR = object : DiffUtil.ItemCallback<Names>() {
            override fun areItemsTheSame(oldItem: Names, newItem: Names): Boolean =
                oldItem.title == newItem.title

            override fun areContentsTheSame(oldItem: Names, newItem: Names): Boolean =
                oldItem == newItem
        }
    }

}