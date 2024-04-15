package com.example.androidprojecttwo.ui.theme.screens.about

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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androidprojecttwo.navigation.ROUTE_HOME

@Composable
fun AboutScreen(navController: NavController){
    Box(modifier = Modifier
        .fillMaxWidth()
        .verticalScroll(rememberScrollState()),
        contentAlignment = Alignment.Center){
        Column(modifier = Modifier
            .fillMaxWidth(0.84f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(modifier = Modifier
                .padding(8.dp)
            ) {
                AboutScreenText(
                    loginScreenText = "ABOUT US",
                    textAlign = TextAlign.Left,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontStyle = FontStyle.Normal,
                    fontFamily = FontFamily.Default
                )
            }
            Row(modifier = Modifier
                .padding(8.dp)) {
                Button(onClick = { navController.navigate(ROUTE_HOME) },
                    modifier  = Modifier
                        .fillMaxWidth(1f)
                        .padding(4.dp)) {
                    Text(text = "TO HOME SCREEN")
                }
            }
        }
    }
    //AboutText()
}
//
@Composable
fun AboutScreenText(loginScreenText: String,
                    textAlign: TextAlign,
                    fontSize: TextUnit,
                    fontWeight: FontWeight,
                    fontStyle: FontStyle,
                    fontFamily: FontFamily
){
    Text(text = loginScreenText,
        textAlign = textAlign,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontStyle = fontStyle,
        fontFamily = fontFamily,
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp)
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(navController = rememberNavController())
}