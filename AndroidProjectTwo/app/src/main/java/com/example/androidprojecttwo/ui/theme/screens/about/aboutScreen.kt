package com.example.androidprojecttwo.ui.theme.screens.about

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androidprojecttwo.navigation.ROUTE_HOME

@Composable
fun AboutScreen(navController: NavController){
    Column {
        Row {
            Box(modifier = Modifier
                .fillMaxWidth(),
                contentAlignment = Alignment.Center) {
                Text(text = "ABOUT US",
                    modifier = Modifier
                        .padding(4.dp),
                    fontSize = 20.sp)
            }
        }
        Row {
            Button(onClick = {
                navController.navigate(ROUTE_HOME)
            },
                modifier  = Modifier
                    .fillMaxWidth(1f)
                    .padding(16.dp)) {
                Text(text = "TO HOME SCREEN")
            }
        }
    }
    //AboutText()
}
//
//@Composable
//fun AboutText(){
//
//
//}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AboutScreenPreview(){
//    AboutScreen(navController = rememberNavController())
}