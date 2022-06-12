package com.mariomonzon.jetpackcomposeexamples.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.mariomonzon.jetpackcomposeexamples.screens.FirstScreen
import com.mariomonzon.jetpackcomposeexamples.screens.SecondScreen


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route){
        composable(route = AppScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(
            route = AppScreens.SecondScreen.route + "/{text}",
            arguments = listOf(navArgument("text") {
                type = NavType.StringType
            })
        ){
            SecondScreen(navController, it.arguments?.getString("text") )
        }
    }
}