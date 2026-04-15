package com.example.moviedb

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.moviedb.ui.Navigation

@Composable
fun MovieDBApp(){
    Scaffold(
        topBar = {},
        modifier = Modifier
    ) { innerPadding ->
        Navigation(innerPadding)
    }
}