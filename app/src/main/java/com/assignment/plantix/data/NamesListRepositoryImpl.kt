package com.assignment.plantix.data

import androidx.lifecycle.LiveData
import com.assignment.plantix.domain.NamesListRepository
import com.assignment.plantix.domain.entity.Names
import javax.inject.Inject

class NamesListRepositoryImpl @Inject constructor(
    private val localData: LocalData,
    private val remoteData: RemoteData
) : NamesListRepository {

    override fun getNames(): LiveData<List<Names>> {
        val lst = localData.getNames()
        if (lst.value.isNullOrEmpty()) {
            return remoteData.fetchNames()
        } else {
            return lst
        }
    }
}
