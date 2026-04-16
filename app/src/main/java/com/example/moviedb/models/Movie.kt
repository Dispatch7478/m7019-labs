package com.example.moviedb.models

data class Movie(
    var id: Int,
    var title: String,
    var imdbId: String,
    var posterPath: String,
    var backdropPath: String,
    var releaseDate: String,
    var overview: String
)
