package com.example.moviedb.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.moviedb.models.Movie


internal const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/"
internal const val POSTER_IMAGE_BASE_WIDTH = "w500"
internal const val BACKDROP_IMAGE_BASE_WIDTH = "w1280"
@Composable
fun MovieListItemCard(
    movie : Movie,
    onMovieClicked: (Int) -> Unit,
    modifier : Modifier = Modifier
    ){
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = modifier
            .width(350.dp)
            .padding(8.dp)
            .clickable { onMovieClicked(movie.id) },
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(4.dp)
        ) {
            AsyncImage(
                model = IMAGE_BASE_URL + POSTER_IMAGE_BASE_WIDTH +  movie.posterPath,
                contentDescription = movie.title,
                modifier = Modifier
                    .width(175.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            // Async image here
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxHeight()
                    .width(200.dp)
            ) {
                Text(
                    text = movie.title,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = movie.overview,
                    maxLines = 3,
                    fontSize = 15.sp
                )
                Spacer(modifier = Modifier.height(50.dp))
                Text(
                    text = "Released: " + movie.releaseDate,
                    textAlign = TextAlign.End
                )
            }
        }
    }
}

@Composable
fun Genres(
    genres : List<String>,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier)
    {
        if (genres.isNotEmpty()) {
            Text(
                text = "Genres",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacer(modifier = Modifier.height(10.dp))
            LazyRow(
                modifier = modifier
            ) {
                items(genres) { genre ->
                    Text(
                        text = genre,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(4.dp)
                            )
                    )
                }
            }
        }
    }
}

//@Preview
//@Composable
//fun HomePagePreview(){
//    MovieDBTheme() {
//        MovieListItemCard(
//            Movies().getTopRatedMovies().first(),
//            modifier = Modifier
//                .fillMaxSize()
//        )
//    }
//}