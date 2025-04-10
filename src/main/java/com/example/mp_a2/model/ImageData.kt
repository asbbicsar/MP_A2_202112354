package com.example.mp_a2.model

import androidx.compose.runtime.saveable.listSaver

data class ImageData(
    val image: Int,
    val checked: Boolean
){
    companion object{
        val ImageSaver = listSaver<ImageData, Any>(
            save = { item ->
                listOf(
                    item.image,
                    item.checked
                )
            },
            restore = { list ->
                ImageData(
                    image = list[0] as Int,
                    checked = list[1] as Boolean
                )
            }
        )
    }
}
