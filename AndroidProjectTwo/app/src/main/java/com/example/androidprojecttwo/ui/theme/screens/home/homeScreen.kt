package com.example.androidprojecttwo.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.androidprojecttwo.navigation.ROUTE_ADD_PRODUCT
import com.example.androidprojecttwo.navigation.ROUTE_VIEW_PRODUCT
//import com.example.androidprojecttwo.navigation.ROUTE_VIEW_PRODUCTS

@Composable
fun HomeScreen(navController: NavHostController){
    Box(modifier = Modifier
        .fillMaxWidth()
        .verticalScroll(rememberScrollState()),
        contentAlignment = Alignment.Center){
        Column(modifier = Modifier,
            verticalArrangement = Arrangement.Center) {

            Row(modifier = Modifier
                .fillMaxWidth(1f)
                .padding(8.dp)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f),
                    contentAlignment = Alignment.Center
                ) {
                    AddProductsButton(navController)
                }
            }
            Row(modifier = Modifier
                .padding(8.dp)) {
                AboutButton(navController)
            }
            Row(modifier = Modifier
                .padding(8.dp)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    ViewProductsButton(navController)
                }
            }
        }
    }
}

@Composable
fun AddProductsButton(navController: NavController) {
    Button(onClick = {
        navController.navigate(ROUTE_ADD_PRODUCT)
    },
        modifier = Modifier,
        shape = RoundedCornerShape(4.dp)
        )
    {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "Add New Products")
        Text(text = "ADD NEW PRODUCTS",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(0.dp))

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewProductsButton(navController: NavHostController) {
//    Card(onClick = { navController.navigate(ROUTE_VIEW_PRODUCT) },
//        modifier = Modifier
//            .padding(0.dp)
//            .background(Color.Transparent),
//        shape = RoundedCornerShape(4.dp)
//       ) {
//        Text(text = "PRODUCTS",
//            textAlign = TextAlign.Center,
//            modifier = Modifier
//                .padding(0.dp))
//    }
    Button(onClick = {
        navController.navigate(ROUTE_VIEW_PRODUCT)
    },modifier = Modifier.fillMaxWidth()) {
        Text(text = "View Product")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(navController = rememberNavController())
}