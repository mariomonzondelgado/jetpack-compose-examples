package com.mariomonzon.jetpackcomposeexamples.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.mariomonzon.jetpackcomposeexamples.R
import com.mariomonzon.jetpackcomposeexamples.navigation.AppScreens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){
    LaunchedEffect(key1 = true){
        delay(5000)
        navController.popBackStack()
        navController.navigate(AppScreens.FirstScreen.route)
    }
    Splash()
}

@Composable
fun Splash(){
    val spec = LottieCompositionSpec.RawRes(R.raw.estrellacf)
    val composition by rememberLottieComposition(spec = spec)
    LottieAnimation(composition = composition, iterations = Int.MAX_VALUE)
}
