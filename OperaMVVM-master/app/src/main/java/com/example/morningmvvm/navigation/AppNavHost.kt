package com.example.morningmvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.morningmvvm.ui.theme.screens.home.AboutScreen
import com.example.morningmvvm.ui.theme.screens.home.HomeScreen
//import com.example.morningmvvm.ui.theme.screens.home.LoginScreen
import com.example.morningmvvm.ui.theme.screens.login.LoginScreen
import com.example.morningmvvm.ui.theme.screens.products.AddProductsScreen
import com.example.morningmvvm.ui.theme.screens.products.UpdateProductsScreen
import com.example.morningmvvm.ui.theme.screens.products.ViewProductsScreen
import com.example.morningmvvm.ui.theme.screens.register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier, navController: NavHostController= rememberNavController(),startDestination: String= ROUTE_REGISTER){
NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
    composable(ROUTE_HOME){
        HomeScreen(navController)
    }
    composable(ROUTE_ABOUT){
        AboutScreen(navController)
    }
    composable(ROUTE_REGISTER){
        RegisterScreen(navController)
    }
    composable(ROUTE_LOGIN){
        LoginScreen(navController)
    }
    composable(ROUTE_ADD_PRODUCT){
        AddProductsScreen(navController)
    }
    composable(ROUTE_VIEW_PRODUCT){
        ViewProductsScreen(navController)
    }
    composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){
        passedData ->
        UpdateProductsScreen(
            navController,passedData.arguments?.getString("id")!!)
    }
}
}