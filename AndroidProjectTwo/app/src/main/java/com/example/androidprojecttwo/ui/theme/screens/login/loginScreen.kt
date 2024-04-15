package com.example.androidprojecttwo.ui.theme.screens.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.example.androidprojecttwo.navigation.ROUTE_REGISTER
import java.net.PasswordAuthentication

@Composable
fun LoginScreen(navController: NavController) {
    Box(modifier = Modifier
        .verticalScroll(rememberScrollState())
        .fillMaxWidth(),
        contentAlignment = Alignment.Center){
        Column(
            modifier = Modifier
                .fillMaxWidth(0.84f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(modifier = Modifier
                .padding(8.dp)) {
                LoginScreenText(loginScreenText = "Welcome Back",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal
                )
            }
            Row(modifier = Modifier
                .padding(8.dp)) {
                LoginScreenText(loginScreenText = "Please Sign In",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal
                )
            }
            Row(
                modifier = Modifier
                    .padding(4.dp),
            ) {
                EmailField()
            }
            Row(
                modifier = Modifier
                    .padding(4.dp),
            ) {
                PasswordField()
            }
            Row(
                modifier = Modifier
                    .padding(8.dp)
                ,
            ) {
                LoginButton(navController)
            }
            Row(modifier = Modifier.padding(8.dp)) {
                LoginScreenText(loginScreenText = "Don't have an account?",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal
                )
            }
            Row(
                modifier = Modifier
                    .padding(8.dp),
            ) {
                SignUpButton(navController)
            }
        }
    }
    }


@Composable
fun LoginScreenText(loginScreenText: String,
                    fontSize: TextUnit,
                    fontWeight: FontWeight,
                    fontStyle: FontStyle){
    Text(text = loginScreenText,
        textAlign = TextAlign.Left,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontStyle = fontStyle,
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp)
    )
}

@Composable
fun EmailField(){
    var text by remember {
        mutableStateOf(value = "")
    }
    TextField(value = text, onValueChange = {
        newText -> text = newText
        },
        label = { Text(text = "Enter your Email") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    )
}

@Composable
fun PasswordField(){
    Box(modifier = Modifier,
        contentAlignment = Alignment.Center){}
    var text by remember {
        mutableStateOf(value = "")
        }
    TextField(value = text, onValueChange = {
        newText -> text = newText
        },
        label = { Text(text = "Enter your Password")},
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    )
}

@Composable
fun LoginButton(navController: NavController){
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()) {
            Text(text = "SIGN IN")
        }
}


@Composable
fun SignUpButton(navController: NavController){
        Button(onClick = {navController.navigate(ROUTE_REGISTER)},
            modifier = Modifier
                .fillMaxWidth()) {
            Text(text = "SIGN UP")
        }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPagePreview(){
    LoginScreen(navController = rememberNavController())
}