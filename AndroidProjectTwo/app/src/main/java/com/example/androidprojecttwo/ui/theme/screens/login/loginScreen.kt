package com.example.androidprojecttwo.ui.theme.screens.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androidprojecttwo.navigation.ROUTE_REGISTER
import java.net.PasswordAuthentication

@Composable
fun LoginScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth(1f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LoginTextIntro(navController)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            contentAlignment = Alignment.Center
        ) {
            EmailField(navController)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            contentAlignment = Alignment.Center
        ) {
            PasswordField(navController)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            LoginButton(navController)
        }
        SignUpQuestion(navController)
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            SignUpButton(navController)
        }
    }
    }


@Composable
fun LoginTextIntro(navController: NavController){
//    Box(modifier = Modifier.fillMaxWidth(),
//        contentAlignment = Alignment.Center){
//        Row(modifier = Modifier
//            .width(320.dp)) {
//            Text(text = "Welcome Back",
//                modifier = Modifier.fillMaxWidth(),
//                textAlign = TextAlign.Left,
//                fontSize = 24.sp
//            )
//        }
//    }
//    Box(modifier = Modifier.fillMaxWidth(),
//        contentAlignment = Alignment.Center){
//        Row(modifier = Modifier
//            .width(320.dp)) {
//            Text(text = "Please Sign In",
//                modifier = Modifier.fillMaxWidth(),
//                textAlign = TextAlign.Left,
//                fontSize = 20.sp
//            )
//        }
//    }
    Box(modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center){
        Column(modifier = Modifier
            .width(320.dp)) {
            Row(){
                Text(text = "Welcome Back",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Left,
                    fontSize = 24.sp
                )
            }
            Row(){
                Text(text = "Please Sign In",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Left,
                    fontSize = 20.sp
                )
            }
        }
    }


}

@Composable
fun EmailField(navController: NavController){
    var text by remember {
        mutableStateOf(value = "")
    }
    TextField(value = text, onValueChange = {
        newText -> text = newText
        },
        label = { Text(text = "Enter your Email") },
        modifier = Modifier
            .width(320.dp)
    )
}

@Composable
fun PasswordField(navController: NavController){
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
            .width(320.dp)
    )
}

@Composable
fun LoginButton(navController: NavController){
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .width(320.dp)) {
            Text(text = "SIGN IN")
        }
}
@Composable
fun SignUpQuestion(navController: NavController){
    Box(modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center){
        Text(text = "Don't have an account?",
            modifier = Modifier,
            textAlign = TextAlign.Center)
    }
}

@Composable
fun SignUpButton(navController: NavController){
        Button(onClick = {navController.navigate(ROUTE_REGISTER)},
            modifier = Modifier
                .width(320.dp)) {
            Text(text = "SIGN UP")
        }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPagePreview(){
    LoginScreen(navController = rememberNavController())
}