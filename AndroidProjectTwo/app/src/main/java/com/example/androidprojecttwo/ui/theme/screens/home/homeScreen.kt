package com.example.androidprojecttwo.ui.theme.screens.home

import android.graphics.Paint.Align
import android.widget.Button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androidprojecttwo.navigation.ROUTE_ABOUT
import com.example.androidprojecttwo.navigation.ROUTE_LOGIN


@Composable
fun HomeScreen(navController: NavController){
    Box(modifier = Modifier
        .fillMaxWidth()
        .verticalScroll(rememberScrollState()),
        contentAlignment = Alignment.Center){
        Column(modifier = Modifier
            .fillMaxWidth(0.84f),
            verticalArrangement = Arrangement.Center) {
            Row(modifier = Modifier
                .padding(8.dp)) {
                HomeScreenText(homeScreenText = "HOME SCREEN",
                    textAlign = TextAlign.Left,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal
                )
            }
            Row(modifier = Modifier
                .padding(8.dp)) {
                LoginButton(navController)
            }
            Row(modifier = Modifier
                .padding(8.dp)) {
                SignUpButton(navController)
            }
            Row(modifier = Modifier
                .padding(8.dp)) {
                AboutButton(navController)
            }
        }
    }
}


@Composable
fun HomeScreenText(homeScreenText:String,
                   textAlign: TextAlign,
                   fontSize: TextUnit,
                   fontWeight: FontWeight,
                   fontStyle: FontStyle){
    Text(text = homeScreenText,
        textAlign = textAlign,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontStyle = fontStyle,
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp)
    )
}
@Composable
fun LoginButton(navController: NavController) {
    Button(onClick = {
        navController.navigate(ROUTE_LOGIN)
                     },
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)) {
        Text(text = "SIGN IN",
            modifier = Modifier
                .padding(4.dp))
    }
}
@Composable
fun SignUpButton(navController: NavController) {
    Button(onClick = {
        navController.navigate(ROUTE_LOGIN)
    },
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)) {
        Text(text = "SIGN UP",
            modifier = Modifier
                .padding(4.dp))
    }
}
@Composable
fun AboutButton(navController: NavController) {
    Button(onClick = {
        navController.navigate(ROUTE_ABOUT)
    },
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)) {
        Text(text = "ABOUT US",
            modifier = Modifier
                .padding(4.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(navController = rememberNavController())
}