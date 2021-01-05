package com.assignment.plantix.data.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.paging.PositionalDataSource
import com.assignment.plantix.data.LocalData
import com.assignment.plantix.domain.entity.Names
import timber.log.Timber
import javax.inject.Inject

class LocalDataImpl @Inject constructor() : LocalData {
    override fun getNames(): LiveData<List<Names>> {
        val namesStringList : MutableList<Names> = arrayListOf()
        namesStringList.add(Names("komal"))
        namesStringList.add(Names("ghisulal"))
        namesStringList.add(Names("gunwanti"))
        namesStringList.add(Names("manan"))
        namesStringList.add(Names("mitti"))
        namesStringList.add(Names("mitesh"))
        namesStringList.add(Names("krattika"))

        val namesList : MutableLiveData<List<Names>> = MutableLiveData(namesStringList)
        return namesList
    }

    class ListDataSource (private val items: List<Names>): PositionalDataSource<Names>() {
        override fun loadInitial (params: LoadInitialParams, callback: LoadInitialCallback<Names>) {
            callback.onResult (items, 0, items.size)
        }
        override fun loadRange (params: LoadRangeParams, callback: LoadRangeCallback<Names>) {
            val start = params.startPosition
            val end = params.startPosition + params.loadSize
            callback.onResult (items.subList (start, end))
        }
    }
}