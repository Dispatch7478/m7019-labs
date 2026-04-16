package com.example.moviedb.data

import com.example.moviedb.models.Movie

data class MovieDBUiState(
    val selectedMovieId: Int? = null,
    val selectedList: MovieListType = MovieListType.POPULAR,
    val favoriteMovies: List<Movie?> = emptyList()
)