package com.example.moviedb.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviedb.data.Movies
import com.example.moviedb.models.Movie
import com.example.moviedb.ui.components.MovieListItemCard
import com.example.moviedb.ui.theme.MovieDBTheme


@Composable
fun HomePage(
    onViewMoreClicked : () -> Unit,
    onMovieClicked : () -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
    ) {
        HorizontalMoviesListPreview(
            listName = "Popular Movies",
            movieList = Movies().getPopularMovies(),
            onViewMoreClicked = {},
        )
        Spacer(modifier = Modifier.height(10.dp))
        HorizontalMoviesListPreview(
            listName = "Top Rated Movies",
            movieList = Movies().getTopRatedMovies(),
            onViewMoreClicked = {},
        )
        // If any favorite here
    }
}

@Composable
fun HorizontalMoviesListPreview(
    listName : String,
    movieList : List<Movie>,
    onViewMoreClicked: () -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .height(400.dp)
            .padding(8.dp)
    ) {
        Text(
            text = listName,
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold
        )
        Spacer(
            modifier = Modifier.height(8.dp)
        )

        LazyRow(
            modifier = Modifier.height(300.dp)
        ) {
            items(movieList.take(6)){ movie ->
                MovieListItemCard(
                    movie,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
        Button(
            onClick = onViewMoreClicked,
            modifier = Modifier
                .align(Alignment.End)
        ) {
            Text(
                text = "View More",
                fontSize = 15.sp
            )
        }
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