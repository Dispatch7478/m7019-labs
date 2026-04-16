package com.example.moviedb.ui.screens

import androidx.lifecycle.ViewModel
import com.example.moviedb.data.MovieDBUiState
import com.example.moviedb.data.MovieListType
import com.example.moviedb.db.Movies
import com.example.moviedb.models.Movie
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MovieViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(MovieDBUiState())
    val uiState : StateFlow<MovieDBUiState> = _uiState.asStateFlow()

    fun setSelectedMovieId(movieId : Int?){
        _uiState.update { state -> state.copy(selectedMovieId = movieId) }
    }

    fun setSelectedMovieList(listType: MovieListType){
        _uiState.update { state -> state.copy(selectedList = listType) }
    }

    private  val db = Movies() // retrofit for lab 2 and all that jazzzzzzzzzzzzzzzzzz
    fun fetchMoviesForCurrentListType() : Pair<String, List<Movie>> {
        val newList = when (_uiState.value.selectedList) {
            MovieListType.POPULAR -> return Pair("Popular Movies", db.getPopularMovies())
            MovieListType.TOP_RATED -> return Pair("Top Rated Movies", db.getTopRatedMovies())
        }
    }

    fun fetchSelectedMovie() : Movie?{
        val currentMovieId = _uiState.value.selectedMovieId ?: return null
        // firstOrNull alias
        return db.getPopularMovies().find { it.id == currentMovieId }
            ?: db.getTopRatedMovies().find { it.id == currentMovieId }
    }

    fun toggleFavorite(movie: Movie?){
        _uiState.update { state ->
            val currentFavorites = state.favoriteMovies.toMutableList()
            if (currentFavorites.contains(movie)){
                currentFavorites.remove(movie)
            } else {
                currentFavorites.add(movie)
            }
            state.copy(favoriteMovies = currentFavorites )
        }
    }

    fun isFavorite() : Boolean {
        return _uiState.value.favoriteMovies.contains(fetchSelectedMovie())
    }
}