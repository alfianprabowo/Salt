package com.main.salt.utils

sealed class Routes(val routes: String) {
    object Login : Routes("Login")
    object Home : Routes("Home")
}