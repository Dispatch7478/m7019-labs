package com.example.moviedb.data

import com.example.moviedb.models.Movie

data class MovieDBUiState(
    val selectedMovie: Movie? = null, // id with db
    val selectedList: MovieListType = MovieListType.POPULAR,
    val favoriteMovies: List<Movie?> = emptyList()
)