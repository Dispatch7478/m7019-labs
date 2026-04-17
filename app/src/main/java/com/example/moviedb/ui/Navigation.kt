package com.example.moviedb.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
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
            val currMovie = viewModel.fetchSelectedMovie()
            if (currMovie == null){
                Text(text = "Error movie not found")
            } else {
                MovieDetails(
                    currMovie,
                    isFavorite = viewModel.isFavorite(),
                    onFavoriteClicked = {viewModel.toggleFavorite(currMovie)},
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
        }
//        composable(route = "") {
//            //MovieReview
//        }
    }
}


enum class MovieDBScreen (val title: String) { // might need later @StringRes val title: Int
    // each const is an obj
    Homepage("The Movie DB"),
    MoviesList("Movie List"),
    MovieDetails("Movie Details"),
    // Reviews
}