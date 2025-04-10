package com.example.mp_a2.uicomponents

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mp_a2.viewmodel.ImageViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    imageViewModel: ImageViewModel = viewModel()
) {
    val imageList = imageViewModel.imageList
    val orientation = LocalConfiguration.current.orientation
    if (orientation == Configuration.ORIENTATION_PORTRAIT) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            ImageList(imageList = imageList)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.Start
                ) {
                    ImageCheckbox(
                        checked = imageList[0].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[0] = imageList[0].copy(checked = checked)
                        },
                        text = "Arms"
                    )
                    ImageCheckbox(
                        checked = imageList[2].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[2] = imageList[2].copy(checked = checked)
                        },
                        text = "Eyebrows"
                    )
                    ImageCheckbox(
                        checked = imageList[4].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[4] = imageList[4].copy(checked = checked)
                        },
                        text = "Glasses"
                    )
                    ImageCheckbox(
                        checked = imageList[6].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[6] = imageList[6].copy(checked = checked)
                        },
                        text = "Mouth"
                    )
                    ImageCheckbox(
                        checked = imageList[8].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[8] = imageList[8].copy(checked = checked)
                        },
                        text = "Nose"
                    )
                }
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.Start
                ) {
                    ImageCheckbox(
                        checked = imageList[1].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[1] = imageList[1].copy(checked = checked)
                        },
                        text = "Ear"
                    )
                    ImageCheckbox(
                        checked = imageList[3].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[3] = imageList[3].copy(checked = checked)
                        },
                        text = "Eyes"
                    )
                    ImageCheckbox(
                        checked = imageList[5].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[5] = imageList[5].copy(checked = checked)
                        },
                        text = "Hat"
                    )
                    ImageCheckbox(
                        checked = imageList[7].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[7] = imageList[7].copy(checked = checked)
                        },
                        text = "Mustache"
                    )
                    ImageCheckbox(
                        checked = imageList[9].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[9] = imageList[9].copy(checked = checked)
                        },
                        text = "Shoes"
                    )
                }
            }
            Text(
                text = "202112354 한승현",
                modifier = Modifier,
                fontSize = 36.sp
            )
        }
    } else {
        Row(
            modifier = Modifier
                .fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            ImageList(imageList = imageList)
            Row(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.Start
                ) {
                    ImageCheckbox(
                        checked = imageList[0].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[0] = imageList[0].copy(checked = checked)
                        },
                        text = "Arms"
                    )
                    ImageCheckbox(
                        checked = imageList[2].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[2] = imageList[2].copy(checked = checked)
                        },
                        text = "Eyebrows"
                    )
                    ImageCheckbox(
                        checked = imageList[4].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[4] = imageList[4].copy(checked = checked)
                        },
                        text = "Glasses"
                    )
                    ImageCheckbox(
                        checked = imageList[6].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[6] = imageList[6].copy(checked = checked)
                        },
                        text = "Mouth"
                    )
                    ImageCheckbox(
                        checked = imageList[8].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[8] = imageList[8].copy(checked = checked)
                        },
                        text = "Nose"
                    )
                }
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.Start
                ) {
                    ImageCheckbox(
                        checked = imageList[1].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[1] = imageList[1].copy(checked = checked)
                        },
                        text = "Ear"
                    )
                    ImageCheckbox(
                        checked = imageList[3].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[3] = imageList[3].copy(checked = checked)
                        },
                        text = "Eyes"
                    )
                    ImageCheckbox(
                        checked = imageList[5].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[5] = imageList[5].copy(checked = checked)
                        },
                        text = "Hat"
                    )
                    ImageCheckbox(
                        checked = imageList[7].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[7] = imageList[7].copy(checked = checked)
                        },
                        text = "Mustache"
                    )
                    ImageCheckbox(
                        checked = imageList[9].checked,
                        modifier = Modifier,
                        { checked ->
                            imageList[9] = imageList[9].copy(checked = checked)
                        },
                        text = "Shoes"
                    )
                }
            }
            Text(
                text = "202112354\n한승현",
                modifier = Modifier,
                textAlign = TextAlign.Center,
                fontSize = 18.sp
            )
        }
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}