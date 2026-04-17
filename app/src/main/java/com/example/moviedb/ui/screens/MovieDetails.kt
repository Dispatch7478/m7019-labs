package com.example.moviedb.ui.screens

import android.R
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import coil3.compose.AsyncImage
import com.example.moviedb.models.Movie
import com.example.moviedb.ui.components.BACKDROP_IMAGE_BASE_WIDTH
import com.example.moviedb.ui.components.Genres
import com.example.moviedb.ui.components.IMAGE_BASE_URL


@Composable
fun MovieDetails (
    movie: Movie?,
    onMovieImdbClicked: (String?) -> Unit,
    isFavorite: Boolean,
    onFavoriteClicked : () -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(top = 20.dp, start = 10.dp, end = 10.dp)
    ) {
        Text(
            text = movie?.title ?: "",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(30.dp))
        AsyncImage(
            model = IMAGE_BASE_URL + BACKDROP_IMAGE_BASE_WIDTH +  movie?.backdropPath,
            contentDescription = movie?.title,
            modifier = Modifier

        )
        Spacer(modifier = Modifier.height(30.dp))
        Column() {
            Text(
                text = "Overview",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = movie?.overview ?: "",
                fontSize = 20.sp,
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Genres(
                genres = movie?.genres ?: emptyList()
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = {
                    if (movie?.imdbId != null){
                        onMovieImdbClicked(movie?.imdbId)
                    }
                }
            ) {
                Text(text = "View on IMDB")
            }
        }

        Row(modifier = Modifier.fillMaxWidth()){
            Text(
                text = "Released: " + movie?.releaseDate ?: "",
                fontSize = 20.sp,
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = onFavoriteClicked,
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(
                text = if (isFavorite) "Remove Favorite" else "Mark Favorite",
                fontSize = 25.sp
            )
        }
    }
}


//@Preview
//@Composable
//fun MovieDetailPreview() {
//    MovieDBTheme() {
//        MovieDetails(
//            //modifier = Modifier.fillMaxHeight()
//        )
//    }
//}