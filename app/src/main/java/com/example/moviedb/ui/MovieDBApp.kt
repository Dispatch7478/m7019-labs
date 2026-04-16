package com.example.moviedb.ui

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MovieDBApp(){
    Scaffold(
        topBar = {},
        modifier = Modifier
    ) { innerPadding ->
        Navigation(innerPadding)
    }
}