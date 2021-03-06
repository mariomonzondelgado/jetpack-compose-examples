package com.mariomonzon.jetpackcomposeexamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mariomonzon.jetpackcomposeexamples.navigation.AppNavigation
import com.mariomonzon.jetpackcomposeexamples.screens.FirstScreen
import com.mariomonzon.jetpackcomposeexamples.ui.theme.JetpackComposeExamplesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent {
                AppNavigation()
            }
        }
    }
}

@Composable
fun MainContent( content: @Composable () -> Unit ){
    JetpackComposeExamplesTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            content()
        }
    }
}

