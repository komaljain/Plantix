package com.assignment.plantix.data.network

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.assignment.plantix.data.RemoteData
import com.assignment.plantix.domain.entity.Names
import javax.inject.Inject

class RemoteDataImpl @Inject constructor() : RemoteData {
    override fun fetchNames() : LiveData<List<Names>> {
        val namesStringList : MutableList<Names> = arrayListOf()
        namesStringList.add(Names("komalR"))
        namesStringList.add(Names("ghisulalR"))
        namesStringList.add(Names("gunwantiR"))
        namesStringList.add(Names("mananR"))
        namesStringList.add(Names("mittiR"))
        namesStringList.add(Names("miteshR"))
        namesStringList.add(Names("krattikaR"))

        val namesList : MutableLiveData<List<Names>> = MutableLiveData(namesStringList)
        return namesList;
    }

}