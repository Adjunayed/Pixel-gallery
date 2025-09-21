// MainNavigation.kt
package com.example.ecommerce.ui

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "login") {

        composable("login") { LoginScreen(navController) }
        composable("register") { RegisterScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("productDetail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId")
            ProductDetailScreen(navController, productId)
        }
        composable("cart") { CartScreen(navController) }
        composable("wishlist") { WishlistScreen(navController) }
        composable("orders") { OrdersScreen(navController) }
        composable("profile") { ProfileScreen(navController) }
    }
}
