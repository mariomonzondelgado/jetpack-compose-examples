package com.mariomonzon.jetpackcomposeexamples.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.mariomonzon.jetpackcomposeexamples.navigation.AppScreens


@Composable
fun FirstScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar {
                Text(text = "First Screen")
            }
        }
    ) {
        FirstBodyContent(navController)
    }
}

@Composable
fun FirstBodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcomo Navigation !")
        Button(onClick = {
            navController.navigate(AppScreens.SecondScreen.route + "/Este es un parámetro por argumentos")
        }) {
            Text(text = "Navigate")
        }

    }
}