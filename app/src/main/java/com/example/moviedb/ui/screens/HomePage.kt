package com.example.moviedb.ui.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.moviedb.ui.theme.MovieDBTheme


@Composable
fun HomePage(
    onViewMoreClicked : () -> Unit,
    onMovieClicked : () -> Unit,
){
    Text(text="displays 3 horizontal scrollable lists (popular, top rated, favorites")
    Button(
        onClick = onViewMoreClicked
    ) {
        Text(text = "View more list")
    }
}


@Preview
@Composable
fun HomePagePreview(){
    MovieDBTheme() {
        HomePage(
            {},
            {}
        )
    }
}