package com.example.threadsclone.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import com.example.threadsclone.R
import com.example.threadsclone.navigation.Routes
import kotlinx.coroutines.delay

@Composable

fun Splash(navController: NavHostController){

    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (image) = createRefs()
        Image(painter = painterResource(id = R.drawable.threads), contentDescription = "Logo",
            modifier = Modifier.constrainAs(image){
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })
        
//        modifier = Modifier.constrainAs(image){
//            top.linkTo(parent.top)
//            bottom.linkTo(parent.bottom)
//            start.linkTo(parent.start)
//            end.linkTo(parent.end)
//        }.size(32.dp)
    }

    LaunchedEffect(true) {
        delay(5000)
        navController.navigate(Routes.BottomNav.routes)
    }
}