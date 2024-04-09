package com.example.androidprojecttwo.ui.theme.screens.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import java.net.PasswordAuthentication

@Composable
fun LoginScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxWidth(),
        verticalArrangement = Arrangement.Center) {
        LoginTextIntro(navController)
        Row(modifier = Modifier
            .fillMaxWidth()) {
            EmailField(navController)
        }
        Row(modifier = Modifier
            .fillMaxWidth()) {
            PasswordField(navController)
        }
        Row(modifier =Modifier
            .fillMaxWidth()) {
            LoginButton(navController)
        }
        Row(modifier = Modifier
            .fillMaxWidth()) {
            SignUpQuestion(navController)
        }
        Row(modifier = Modifier
            .fillMaxWidth()) {
            SignUpButton(navController)
        }
    }
}

@Composable
fun LoginTextIntro(navController: NavController){
    Text(text = "Welcome Back",
        modifier = Modifier.fillMaxWidth(),
        )
    Text(text = "Please Sign In",
        modifier = Modifier.fillMaxWidth(),
        )
}

@Composable
fun EmailField(navController: NavController){
    var text by remember {
        mutableStateOf(value = "")
    }
    TextField(value = text, onValueChange = {
        newText -> text = newText
        },
        label = { Text(text = "Enter your Email") }
    )
}

@Composable
fun PasswordField(navController: NavController){
    var text by remember {
        mutableStateOf(value = "")
        }
    TextField(value = text, onValueChange = {
        newText -> text = newText
        },
        label = { Text(text = "Enter your Password") }
    )
}

@Composable
fun LoginButton(navController: NavController){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "SIGN IN")
        }
}
@Composable
fun SignUpQuestion(navController: NavController){
    Text(text = "Don't have an account?",
        modifier = Modifier.fillMaxWidth())
}

@Composable
fun SignUpButton(navController: NavController){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "SIGN UP",)
        }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPagePreview(){
    LoginScreen(navController = rememberNavController())
}