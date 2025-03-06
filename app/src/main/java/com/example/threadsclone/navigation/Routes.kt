package com.example.threadsclone.navigation

sealed class Routes(val routes: String) {
    object Home : Routes("home")
    object AddThreads : Routes("add_threads")
    object Profile : Routes("profile")
    object Notification : Routes("notification")
    object Search : Routes("search")
    object Splash : Routes("splash")
    object BottomNav : Routes("bottom_nav")
}