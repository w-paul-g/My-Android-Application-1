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
import androidx.navigation.compose.rememberNavController
import com.example.androidprojecttwo.navigation.ROUTE_ADD_PRODUCT
import com.example.androidprojecttwo.navigation.ROUTE_VIEW_PRODUCTS

@Composable
fun HomeScreen(navController: NavController){
    Box(modifier = Modifier
        .fillMaxWidth()
        .verticalScroll(rememberScrollState()),
        contentAlignment = Alignment.Center){
        Column(modifier = Modifier
            ,
            verticalArrangement = Arrangement.Center) {
//            Row(modifier = Modifier
//                .padding(8.dp)) {
//                HomeScreenText(homeScreenText = "HOME SCREEN",
//                    textAlign = TextAlign.Left,
//                    fontSize = 26.sp,
//                    fontWeight = FontWeight.Bold,
//                    fontStyle = FontStyle.Normal
//                )
//            }
//            Row(modifier = Modifier
//                .padding(8.dp)) {
//                LoginButton(navController)
//            }
//            Row(modifier = Modifier
//                .padding(8.dp)) {
//                SignUpButton(navController)
//            }
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
                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    ViewProductsButton(navController)
                }

            }
//            Row(modifier = Modifier
//                .padding(8.dp)) {
//            }
//            Row(modifier = Modifier
//                .padding(8.dp)) {
//                UpdateProductsButton(navController)
//            }

            Row(modifier = Modifier
                .padding(8.dp)) {
                AboutButton(navController)
            }
        }
    }
}

//
//@Composable
//fun HomeScreenText(homeScreenText:String,
//                   textAlign: TextAlign,
//                   fontSize: TextUnit,
//                   fontWeight: FontWeight,
//                   fontStyle: FontStyle){
//    Text(text = homeScreenText,
//        textAlign = textAlign,
//        fontSize = fontSize,
//        fontWeight = fontWeight,
//        fontStyle = fontStyle,
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(2.dp)
//    )
//}
//@Composable
//fun LoginButton(navController: NavController) {
//    Button(onClick = {
//        navController.navigate(ROUTE_LOGIN)
//    },
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(4.dp)) {
//        Text(text = "SIGN IN",
//            modifier = Modifier
//                .padding(4.dp))
//    }
//}
//@Composable
//fun SignUpButton(navController: NavController) {
//    Button(onClick = {
//        navController.navigate(ROUTE_LOGIN)
//    },
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(4.dp)) {
//        Text(text = "SIGN UP",
//            modifier = Modifier
//                .padding(4.dp))
//    }
//}
//@Composable
//fun AboutButton(navController: NavController) {
//    Button(onClick = {
//        navController.navigate(ROUTE_ABOUT)
//    },
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(4.dp)) {
//        Text(text = "ABOUT US",
//            modifier = Modifier
//                .padding(4.dp))
//    }
//}
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
//@Composable
//fun UpdateProductsButton(navController: NavController) {
//    Button(onClick = {
//        navController.navigate(ROUTE_UPDATE_PRODUCT)
//    },
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(4.dp)) {
//        Text(text = "UPDATE PRODUCTS",
//            modifier = Modifier
//                .padding(4.dp))
//    }
//}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewProductsButton(navController: NavController) {
    Card(onClick = {
        navController.navigate(ROUTE_VIEW_PRODUCTS)
    },
        modifier = Modifier
            .padding(0.dp)
            .background(Color.Transparent),
        shape = RoundedCornerShape(4.dp)
       ) {
        Text(text = "PRODUCTS",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(0.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(navController = rememberNavController())
}