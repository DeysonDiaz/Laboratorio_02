package com.example.foods


import androidx.compose.runtime.Composable
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.foods.Destinations.*
import com.example.foods.Pantalla1
import com.example.foods.Pantalla2


@Composable
fun NavigationHost(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Pantalla1.route){
        composable(Pantalla1.route){
            Pantalla1(
                navegarPantalla2 = {
                    navController.navigate(Pantalla2.createRoute(it))
                }
            )

        }
        composable(
            Pantalla2.route,
            arguments = listOf(navArgument("newText"){defaultValue="Pantalla2"})
        ){navBackStackEntry ->
            var newText = navBackStackEntry.arguments?.getString("newText")
            requireNotNull(newText)
            Pantalla2(newText)

        }

    }
}