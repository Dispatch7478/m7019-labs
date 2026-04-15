package com.example.moviedb.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.moviedb.ui.theme.MovieDBTheme


@Composable
fun HomePage(
    onViewMoreClicked : () -> Unit,
    onMovieClicked : () -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
    ) {
        Text(text="displays 3 horizontal scrollable lists (popular, top rated, favorites")
        Button(
            onClick = onViewMoreClicked
        ) {
            Text(text = "View more list")
        }
    }
}

@Composable
fun HorizontalMoviesListPreview(
    onViewMoreClicked: () -> Unit
){
    LazyRow() {
        // List of movie cards
    }
    Button(
        onClick = onViewMoreClicked
    ) {
        Text(text = "View More")
    }
}


@Preview
@Composable
fun HomePagePreview(){
    MovieDBTheme() {
        HomePage(
            {},
            {},
            modifier = Modifier
                .fillMaxSize()
        )
    }
}