package com.example.safewater

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.LocationScreen
import com.example.myapplication.Species
import com.example.safewater.ui.theme.EcoSwimwear
import com.example.safewater.ui.theme.GoodPractice
import com.example.safewater.ui.theme.SuitableSunscreen

@Composable
fun Navigation(navHostController : NavHostController){

    NavHost(navController = navHostController, startDestination = ScreenRoutes.MainScreen.route){
        composable(ScreenRoutes.MainScreen.route){
            MainScreen(navController = navHostController)
        }
        composable(ScreenRoutes.GoodPractices.route){
            GoodPractice(navController = navHostController)
        }
        composable(ScreenRoutes.Species.route){
            Species(navController = navHostController)
        }
        composable(ScreenRoutes.SuitableSunscreen.route){
            SuitableSunscreen(navController = navHostController)
        }
        composable(ScreenRoutes.LocationScreen.route){
            LocationScreen(navController = navHostController)
        }
        composable(ScreenRoutes.EcoSwimwear.route){
            EcoSwimwear(navController = navHostController)
        }
        // alte composable uri
    }
}