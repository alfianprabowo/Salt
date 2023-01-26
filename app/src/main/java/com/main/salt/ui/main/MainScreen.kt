package com.main.salt.ui.main

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.main.salt.ui.main.view.HomePage
import com.main.salt.ui.main.view.login.LoginPage
import com.main.salt.utils.Routes

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Login.routes ){
        composable(Routes.Login.routes) {
//            LoginPage(navController = navController)
        }

        composable(Routes.Home.routes) {
            HomePage(navController = navController)
        }
    }
}