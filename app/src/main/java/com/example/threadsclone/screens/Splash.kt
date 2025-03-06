package com.example.threadsclone.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import com.example.threadsclone.navigation.Routes
import kotlinx.coroutines.delay

@Composable

fun Splash(navController: NavHostController){
    Text(text = "Splash")

    LaunchedEffect(true) {
        delay(5000)
        navController.navigate(Routes.BottomNav.routes)
    }
}