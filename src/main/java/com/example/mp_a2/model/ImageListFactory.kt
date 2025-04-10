package com.example.mp_a2.model

import com.example.mp_a2.R

object ImageListFactory {
    fun makeImageList() = mutableListOf(
        ImageData(
            image = R.drawable.arms,
            checked = false
        ),
        ImageData(
            image = R.drawable.ears,
            checked = false
        ),
        ImageData(
            image = R.drawable.eyebrows,
            checked = false
        ),
        ImageData(
            image = R.drawable.eyes,
            checked = false
        ),
        ImageData(
            image = R.drawable.glasses,
            checked = false
        ),
        ImageData(
            image = R.drawable.hat,
            checked = false
        ),
        ImageData(
            image = R.drawable.mouth,
            checked = false
        ),
        ImageData(
            image = R.drawable.mustache,
            checked = false
        ),
        ImageData(
            image = R.drawable.nose,
            checked = false
        ),
        ImageData(
            image = R.drawable.shoes,
            checked = false
        )
    )
}