package com.example.mp_a2.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import com.example.mp_a2.model.ImageData
import com.example.mp_a2.model.ImageListFactory

class ImageViewModel: ViewModel() {
    private val _imageList = mutableStateListOf<ImageData>().apply {
        addAll(ImageListFactory.makeImageList())
    }
    val imageList: SnapshotStateList<ImageData>
        get() = _imageList
}