package com.example.moviedb.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MoviePreviewCard(
    title :String,
    description: String,
    imageResource: Int,
    modifier : Modifier = Modifier
    ){
    Card(
        modifier = modifier
            .width(260.dp)
            .padding(8.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row() {
            Image(
                painter = painterResource(imageResource),
                contentDescription = null
            )

            Column() {
                Text(
                    text = title
                )
                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = description,
                    maxLines = 3,
                )
            }
        }
    }
}