package com.example.foods

sealed class Destinations(
    val route:String
){
    object Pantalla1:Destinations("pantalla1")
    object Pantalla2:Destinations("pantalla2/?newText={newText}"){
        fun createRoute(newText:List<String>)="pantalla2/?newText=$newText"
    }

}
