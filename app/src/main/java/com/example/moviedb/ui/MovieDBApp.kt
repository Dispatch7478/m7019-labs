package com.example.moviedb.ui

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.moviedb.ui.screens.MovieViewModel

@Composable
fun MovieDBApp(
    viewModel: MovieViewModel = viewModel(),
    // remote controller to switch screens.
    navController: NavHostController = rememberNavController()
){
    // will use later to be able to go back
    // val backStackEntry by navController.currentBackStackEntryAsState()
    // val currentScreen

    Scaffold( // App container
        topBar = {},
        modifier = Modifier
    ) { innerPadding ->
        Navigation(
            navController,
            viewModel,
            innerPadding
        )
    }
}