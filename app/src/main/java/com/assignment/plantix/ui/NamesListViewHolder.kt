package com.assignment.plantix.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.assignment.plantix.R
import com.assignment.plantix.domain.entity.Names
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_names.view.*
import timber.log.Timber

class NamesListViewHolder(override val containerView: View) :
    RecyclerView.ViewHolder(containerView), LayoutContainer {

    fun bind(name: Names?) {
        Timber.d("name:" + name)
        if (name != null) {
            with(name) {
                containerView.actvNames.text = name.title.capitalize()
            }
        }
    }

    companion object {
        fun create(parent: ViewGroup): NamesListViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_names, parent, false)
            return NamesListViewHolder(view)
        }
    }
}