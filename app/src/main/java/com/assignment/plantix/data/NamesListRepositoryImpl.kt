package com.assignment.plantix.data

import android.security.identity.ResultData
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.PagedList
import com.assignment.plantix.PlantixApplication
import com.assignment.plantix.domain.NamesListRepository
import com.assignment.plantix.domain.entity.Names
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import kotlinx.coroutines.Dispatchers
import timber.log.Timber
import javax.inject.Inject
import kotlin.Result.Companion.success

class NamesListRepositoryImpl @Inject constructor(private val localData: LocalData,
    private val remoteData: RemoteData) : NamesListRepository {

    override fun getNames(): LiveData<List<Names>> {
        val lst = localData.getNames()
        if(lst.value.isNullOrEmpty()) {
            return remoteData.fetchNames()
        } else {
            return lst
        }
    }

}