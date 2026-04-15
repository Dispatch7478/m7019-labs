package com.example.moviedb.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.moviedb.ui.theme.MovieDBTheme




@Composable
fun MovieDetails (){
    Text(text = "basic info from the api details route")
}
@Preview
@Composable
fun MovieDetailPreview() {
    MovieDBTheme() {
        MovieDetails(
            //modifier = Modifier.fillMaxHeight()
        )
    }
}