package com.example.demo

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginScreen() {
    Surface {
        Column(modifier = Modifier.fillMaxSize()) {
            val uiColor = if (isSystemInDarkTheme()) Color.White else Color.Black
            Box(
                contentAlignment = Alignment.TopCenter
            ) {
                Image(
                    modifier=Modifier.fillMaxWidth().fillMaxHeight(fraction = 0.46f),
                    painter = painterResource(id = R.drawable.daidai),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )

            }
        }
    }
}

@Preview
@Composable
fun LoginScreenPreView() {
    LoginScreen()
}