package com.example.androidprojecttwo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidprojecttwo.data.AuthViewModel
import com.example.androidprojecttwo.ui.theme.screens.about.AboutScreen
import com.example.androidprojecttwo.ui.theme.screens.home.HomeScreen
import com.example.androidprojecttwo.ui.theme.screens.home.WelcomeScreen
import com.example.androidprojecttwo.ui.theme.screens.login.LoginScreen
import com.example.androidprojecttwo.ui.theme.screens.products.AddProductScreen
import com.example.androidprojecttwo.ui.theme.screens.register.RegisterScreen


@Composable
fun AppNavHost(
    modifier :Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination : String = ROUTE_WELCOME
//               Boolean = if (isloggedin){
//                   return ROUTE_HOME
//               }else{
//                   return ROUTE_WELCOME
//               }
){
    NavHost(navController = navController,
        modifier = modifier,
        startDestination = startDestination){
        composable(ROUTE_WELCOME){
            WelcomeScreen(navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT){
            AddProductScreen(navController)
        }

    }
}