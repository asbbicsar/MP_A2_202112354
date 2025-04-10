package com.example.mp_a2.uicomponents

import android.media.Image
import androidx.compose.foundation.layout.Box
import com.example.mp_a2.R
import coil3.compose.AsyncImage
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mp_a2.model.ImageData
import com.example.mp_a2.model.ImageListFactory

@Composable
fun ImageList(
    modifier: Modifier = Modifier,
    imageList: MutableList<ImageData>
) {
    Box(modifier = Modifier)
    {
        AsyncImage(
            model = R.drawable.body,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(360.dp)
        )
        imageList.forEachIndexed { index, ImageData ->
            if (ImageData.checked == true) {
                AsyncImage(
                    model = ImageData.image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(360.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun ImageListPrev() {
    ImageList(
        modifier = Modifier,
        imageList = ImageListFactory.makeImageList()
    )
}