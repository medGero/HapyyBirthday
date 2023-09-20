package com.example.hapyybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.hapyybirthday.ui.theme.HapyyBirthdayTheme
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HapyyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

            }
        }
    }
}
@Composable
fun GreetingText(message: String,from:String, modifier: Modifier = Modifier) {
    Text(
        text =message,
        fontSize = 70.sp,
        lineHeight = 120.sp,
        textAlign = TextAlign.Center,
        

    )
    Text(text = from,
        fontSize = 26.sp,

    )
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "meine previw"
)







    private @Composable
    fun HappyBirthdayTheme() {
        GreetingText(message = "Happy Birthday Sam!", from = "From serhat")
    }
}
