package com.example.moviedb.network

import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET
//import kotlinx.serialization.json.Json
//
//private const val BASE_URL = "https://api.themoviedb.org/3/"
//
//private val retrofit = Retrofit.Builder()
//    .addConverterFactory(ScalarsConverterFactory.create())
//    .baseUrl(BASE_URL)
//    .build()
//
//// Explains how retrofit talks to the server
//interface TheMovieDBApiService {
//    @GET("movie/movie_id?") // examine how to pass args
//    fun getMovieDetails() : String // might switch to list of movies
//
//    // popular
//    // top rated
//    // favorites through list of ids?
//}
//
//object MovieDBApi {
//    val retrofitService : TheMovieDBApiService by lazy {
//        retrofit.create(TheMovieDBApiService::class.java)
//    }
//}