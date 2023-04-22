package edu.itsco.notas.ui.navigation

sealed class Screen(val url: String){
    object HomeScreen: Screen(url = "home")
    object AddNotaScreen: Screen(url = "AddNota")
}
