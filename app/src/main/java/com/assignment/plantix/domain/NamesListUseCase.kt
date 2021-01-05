package com.assignment.plantix.domain

import androidx.lifecycle.LiveData
import com.assignment.plantix.domain.entity.Names
import javax.inject.Inject

class NamesListUseCase @Inject constructor(private val repository: NamesListRepository) {

    fun getNames(): LiveData<List<Names>> {
        return repository.getNames()
    }
}
