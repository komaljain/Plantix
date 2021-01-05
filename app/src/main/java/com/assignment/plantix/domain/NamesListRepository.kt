package com.assignment.plantix.domain

import androidx.lifecycle.LiveData
import com.assignment.plantix.domain.entity.Names

interface NamesListRepository {
    fun getNames(): LiveData<List<Names>>
}
