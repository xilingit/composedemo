package com.example.demo

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Surface {
        Column(modifier = modifier.fillMaxSize()) {
            topSection(modifier)
            Spacer(modifier = modifier.padding(top = 50.dp))
            Column(modifier = modifier.fillMaxSize().padding(horizontal = 30.dp)) {

            }
        }
    }
}

@Composable
private fun topSection(modifier: Modifier) {
    val uiColor = if (isSystemInDarkTheme()) Color.White else Color.Black
    Box(
        contentAlignment = Alignment.TopCenter
    ) {
        Image(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.46f),
            painter = painterResource(id = R.drawable.daidai),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
        Row(
            modifier = modifier.padding(top = 80.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = modifier.size(42.dp),
                painter = painterResource(id = R.drawable.cart_full),
                contentDescription = null,
                tint = uiColor
            )
            Spacer(modifier = modifier.width(15.dp))
            Column {
                Text(
                    text = stringResource(id = R.string.app_name),
                    color = uiColor
                )
                Text(
                    text = stringResource(id = R.string.helloworld),
                    color = uiColor
                )
            }
        }
        Text(text = "登录")
    }
}

@Preview
@Composable
fun LoginScreenPreView() {
    LoginScreen()
}