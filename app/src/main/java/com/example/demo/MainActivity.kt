package com.example.demo

import android.os.Bundle
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.demo.ui.theme.DemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    var name by rememberSaveable {
        mutableStateOf("")
    }
    Greet(name = name, onNameChanged = { name = it })
}

@Composable
fun Greet(modifier: Modifier = Modifier, name: String, onNameChanged: (String) -> Unit) {
    Column(modifier = modifier.padding(16.dp)) {
        if (name.isNotEmpty()) {
            Text(
                text = "Hello! $name",
                modifier = modifier.padding(bottom = 8.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }

//        AsyncImage(
//            model = "https://img-blog.csdnimg.cn/20200401094829557.jpg",
//            contentDescription = "First line of code"
//        )
        LinearProgressIndicator()
        CircularProgressIndicator()
        Button(onClick = { /*TODO*/ }) {
            Text(text = "hello world")
        }
        OutlinedTextField(
            value = name,
            onValueChange = onNameChanged,
            label = { Text("please enter your name") }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DemoTheme {
        Greet(name = "hha", onNameChanged = {})
    }
}
