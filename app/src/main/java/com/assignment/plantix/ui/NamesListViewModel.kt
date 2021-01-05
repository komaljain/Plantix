package com.assignment.plantix.ui

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.assignment.plantix.domain.NamesListUseCase
import javax.inject.Inject

class NamesListViewModel @ViewModelInject constructor(private val namesListUseCase: NamesListUseCase,
    @Assisted private val savedStateHandle: SavedStateHandle)
    : ViewModel() {
    val names = namesListUseCase.getNames()
}