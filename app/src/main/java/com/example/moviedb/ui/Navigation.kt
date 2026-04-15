package com.example.moviedb.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.moviedb.ui.screens.HomePage
import com.example.moviedb.ui.screens.MovieDetails
import com.example.moviedb.ui.screens.MoviesList


@Composable
fun Navigation(
    innerPadding : PaddingValues
){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MovieDBScreen.Homepage.name,
        modifier = Modifier.padding(innerPadding)
    ) {
        composable(route = MovieDBScreen.Homepage.name,) {// route+"/{param}/{param}"
            HomePage(
                onViewMoreClicked = {
                    navController.navigate(MovieDBScreen.MoviesList.name)
                },
                onMovieClicked = {

                },
                modifier = Modifier
                    .fillMaxSize()
                    //.padding(dimensionResource(R.dimen.padding_medium))
            )
        }
        composable(route = MovieDBScreen.MoviesList.name) {
            MoviesList()
        }
        composable(route = MovieDBScreen.MovieDetails.name + "/{movieId}") {
            MovieDetails()
        }
//        composable(route = "") {
//            //MovieReview
//        }
    }
}

enum class MovieDBScreen { // might need later @StringRes val title: Int
    // each const is an obj
    Homepage,
    MoviesList,
    MovieDetails,
    // Reviews
}