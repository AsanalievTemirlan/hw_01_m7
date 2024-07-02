package com.example.hw_01_m7.ui.fragment.doorFrament

import Repository
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hw_01_m7.data.network.models.doorsModel.DoorsBaseResponse
import dagger.Module
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DoorViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {


}
