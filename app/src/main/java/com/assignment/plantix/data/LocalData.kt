package com.assignment.plantix.data

import androidx.lifecycle.LiveData
import com.assignment.plantix.domain.entity.Names

interface LocalData {

    fun getNames(): LiveData<List<Names>>
}
