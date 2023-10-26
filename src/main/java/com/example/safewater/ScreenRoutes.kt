package com.example.safewater

import androidx.navigation.NavController

sealed class ScreenRoutes(val route : String) {

    object MainScreen : ScreenRoutes("MainScreen")
    object GoodPractices : ScreenRoutes("GoodPractices")
    object Species : ScreenRoutes("Species")
    object SuitableSunscreen : ScreenRoutes("SuitableSunscreen")
    object LocationScreen : ScreenRoutes("LocationScreen")
    object EcoSwimwear : ScreenRoutes("EcoSwimwear")
}

object NavigationActions{
    fun navigateTo(navController: NavController, screen: ScreenRoutes){
        navController.navigate(screen.route)
    }
}