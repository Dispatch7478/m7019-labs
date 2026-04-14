package com.example.moviedb.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "",
        modifier = Modifier
    ) {
        composable(route = "") {// route+"/{param}/{param}"
            //HomePage()
        }
        composable(route = "") {
            //MoviesList
        }
        composable(route = "") {
            //MovieDetails
        }
        composable(route = "") {
            //MovieReview
        }
    }
}