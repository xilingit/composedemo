package com.example.demo

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LoginTextField(modifier:Modifier = Modifier, label: String, trailing:String) {
    TextField(
        modifier = modifier,
        value = "",
        colors = TextFieldDefaults.colors(),
        trailingIcon = {
                       Text(text = trailing)
        },
        onValueChange = {},
        label = { Text(text = label)}
        )
}