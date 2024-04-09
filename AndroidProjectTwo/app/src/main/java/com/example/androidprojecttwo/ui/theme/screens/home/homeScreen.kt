package com.example.androidprojecttwo.ui.theme.screens.home

import android.graphics.Paint.Align
import android.widget.Button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androidprojecttwo.navigation.ROUTE_ABOUT
import com.example.androidprojecttwo.navigation.ROUTE_LOGIN


@Composable
fun HomeScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(4.dp),
        verticalArrangement = Arrangement.Center) {
        Row {
            HomeScreenText()
        }
        Row {
            LoginButton(navController = navController)
        }
    }


}

@Composable
fun HomeScreenText(){
    Text(text = "Home Screen",
        textAlign = TextAlign.Center,
        fontSize = 30.sp,
        modifier = Modifier.fillMaxWidth(1f))
}
@Composable
fun LoginButton(navController: NavController) {
    Button(onClick = {
        navController.navigate(ROUTE_LOGIN)
                     },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)) {
        Text(text = "SIGN IN",
            modifier = Modifier
                .padding(5.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
//    HomeScreen(navController = rememberNavController())
}