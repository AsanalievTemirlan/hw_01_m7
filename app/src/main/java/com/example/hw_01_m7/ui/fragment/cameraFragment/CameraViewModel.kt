package com.example.hw_01_m7.ui.fragment.cameraFragment

import Repository
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bumptech.glide.load.engine.Resource
import com.example.hw_01_m7.data.network.models.camerasModel.CamerasBaseResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class CameraViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    suspend fun getCamera() {
        return repository.fetchCameras()
    }
}