package com.example.moviedb.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.moviedb.ui.theme.MovieDBTheme


@Composable
fun MoviesList(){
    Text(
        text = "lazy column for select category of movies"
    )
}

@Preview
@Composable
fun MoviesListPreview() {
    MovieDBTheme() {
        MoviesList(
            //modifier = Modifier.fillMaxHeight()
        )
    }
}