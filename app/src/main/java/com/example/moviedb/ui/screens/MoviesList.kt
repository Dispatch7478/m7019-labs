package com.example.moviedb.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviedb.data.MovieListType
import com.example.moviedb.db.Movies
import com.example.moviedb.models.Movie
import com.example.moviedb.ui.components.MovieListItemCard
import com.example.moviedb.ui.theme.MovieDBTheme


@Composable
fun MoviesList(
    title: String,
    list: List<Movie>,
    onMovieClicked: (Int) -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(8.dp)
    ) {
        Text(
            text = title,
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold
        )
        Spacer(modifier = Modifier.height(10.dp))
        LazyColumn() {
            items(list){ movie ->
                MovieListItemCard(
                    movie,
                    onMovieClicked,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}