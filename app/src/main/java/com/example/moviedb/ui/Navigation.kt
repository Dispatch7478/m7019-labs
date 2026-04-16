package com.example.moviedb.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.moviedb.data.MovieListType
import com.example.moviedb.db.Movies
import com.example.moviedb.ui.screens.HomePage
import com.example.moviedb.ui.screens.MovieDetails
import com.example.moviedb.ui.screens.MovieViewModel
import com.example.moviedb.ui.screens.MoviesList


@Composable
fun Navigation(
    navController: NavHostController,
    viewModel: MovieViewModel,
    innerPadding : PaddingValues
){
    // watch data stream in the viewModel and update the
    // respective UI composables that use when the state changes.
    val uiState by viewModel.uiState.collectAsState()

    NavHost(
        navController = navController,
        startDestination = MovieDBScreen.Homepage.name,
        modifier = Modifier.padding(innerPadding)
    ) {
        composable(route = MovieDBScreen.Homepage.name,) {// route+"/{param}/{param}"
            HomePage(
                onViewMoreClicked = { listType ->
                    viewModel.setSelectedMovieList(listType)
                    navController.navigate(MovieDBScreen.MoviesList.name)
                },
                onMovieClicked = { movieId ->
                    viewModel.setSelectedMovieId(movieId)
                    navController.navigate(MovieDBScreen.MovieDetails.name)
                },
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        composable(route = MovieDBScreen.MoviesList.name) {
            val (title, selectedList) = viewModel.fetchMoviesForCurrentListType()
            MoviesList(
                title,
                selectedList,
                onMovieClicked = { movieId ->
                    viewModel.setSelectedMovieId(movieId)
                    navController.navigate(MovieDBScreen.MovieDetails.name)
                } ,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        composable(route = MovieDBScreen.MovieDetails.name) {
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