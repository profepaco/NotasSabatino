package edu.itsco.notas.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.itsco.notas.ui.screens.AddNotaScreen
import edu.itsco.notas.ui.screens.HomeScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.url
    ){
        composable(
            route = Screen.HomeScreen.url
        ){
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.AddNotaScreen.url
        ){
            AddNotaScreen(navController = navController)
        }
    }
}