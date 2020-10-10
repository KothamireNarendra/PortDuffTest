package com.example.composeapplication

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color

@Composable
fun Test(modifier: Modifier = Modifier) {

    Canvas(modifier = modifier) {

        drawRect(color = Color.Magenta,
                size = Size(size.width, size.height)
        )

        drawCircle(
                color = Color.White,
                radius = 200f,
                center = Offset((size.width / 4), size.width / 2),
                blendMode = BlendMode.Xor) // Don't know what to put here

        drawCircle(color = Color.White,
                radius = 200f,
                center = Offset((size.width / 4) + size.width / 4f, size.width / 2),
                blendMode = BlendMode.Xor) // Don't know what to put here
    }

}