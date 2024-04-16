package com.example.androidprojecttwo.ui.theme.screens.register

import android.service.quickaccesswallet.QuickAccessWalletService
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
import com.example.androidprojecttwo.navigation.ROUTE_LOGIN

@Composable
fun RegisterScreen(navController: NavController){
    Box(modifier = Modifier
        .fillMaxWidth()
        .verticalScroll(rememberScrollState()),
        contentAlignment = Alignment.Center){
        Column(modifier = Modifier
            .fillMaxWidth(0.84f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Row(modifier = Modifier
                .padding(8.dp)) {
                //Text
                RegisterScreenText(registerScreenText = "Welcome",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal
                )
            }
            Row(modifier = Modifier
                .padding(8.dp)) {
                RegisterScreenText(registerScreenText = "Please Register",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal
                )
            }
            Row(modifier = Modifier
                .padding(4.dp)) {
                NameFields(nameField = "First Name")
            }
            Row(modifier = Modifier
                .padding(4.dp)){
                NameFields(nameField = "Middle Name")
            }
            Row(modifier = Modifier
                .padding(4.dp)) {
                NameFields(nameField = "Last Name")
            }
            Row(modifier = Modifier
                .padding(4.dp)) {
                NameFields(nameField = "Surname")
            }
            Row(modifier = Modifier
                .padding(4.dp)) {
                PhoneNumberField(phoneNumberField = "Enter your Phone Number")
            }
            Row(modifier = Modifier
                .padding(4.dp)) {
                EmailField(emailField = "Enter your Email")
            }
            Row (modifier = Modifier
                .padding(4.dp)){
                PasswordFieldCreate(createPassword = "Enter your Password")
            }
            Row(modifier = Modifier
                .padding(8.dp)) {
                RegisterScreenText(registerScreenText = "Note: Ensure that your Password contains at least two Uppercase letters," +
                        " two numbers and two non-alphanumeric character",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light,
                    fontStyle = FontStyle.Italic
                )
            }
            Row(modifier = Modifier
                .padding(4.dp)) {
                PasswordFieldConfirm(confirmPassword = "Confirm your Password")
            }
            Row(modifier = Modifier
                .padding(8.dp)) {
                SignUpButton(navController)
            }
            Row (modifier = Modifier
                .padding(8.dp)){
                RegisterScreenText(registerScreenText = "Already have an account?",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal)
            }
            Row (modifier = Modifier
                .padding(8.dp)){
                LogInButton(navController)
            }
        }
    }

}



@Composable
fun RegisterScreenText(registerScreenText: String,
                       fontSize: TextUnit,
                       fontWeight: FontWeight,
                       fontStyle: FontStyle){
    Text(text = registerScreenText,
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
fun NameFields(nameField :String){
    var text by remember{
        mutableStateOf(value = "")
    }
    TextField(value = text,
        onValueChange = {
            newText -> text = newText
        },
        label = {
            Text(text = nameField)
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp))
}

@Composable
fun PhoneNumberField(phoneNumberField: String){
    var text by remember{
        mutableStateOf(value = "")
    }
    TextField(value = text,
        onValueChange = {
                newText -> text = newText
        },
        label = {
            Text(text = phoneNumberField)
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp))

}
@Composable
fun EmailField(emailField: String){
    var text by remember{
        mutableStateOf(value = "")
    }
    TextField(value = text,
        onValueChange = {
                newText -> text = newText
        },
        label = {
            Text(text = emailField)
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp))
}


@Composable
fun PasswordFieldCreate(createPassword: String){
    var text by remember{
        mutableStateOf(value = "")
    }
    TextField(value = text,
        onValueChange = {
                newText -> text = newText
        },
        label = {
            Text(text = createPassword)
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp))
}


@Composable
fun PasswordFieldConfirm(confirmPassword: String){
    var text by remember{
        mutableStateOf(value = "")
    }
    TextField(value = text,
        onValueChange = {
                newText -> text = newText
        },
        label = {
            Text(text = confirmPassword)
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp))
}

@Composable
fun SignUpButton(navController: NavController){
    Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)) {
        Text(text = "SIGN UP")
    }
}

@Composable
fun LogInButton(navController: NavController){
    Button(onClick = {navController.navigate(ROUTE_LOGIN)},
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)) {
        Text(text = "LOGIN")
    }
}
//
//@Preview(showBackground = true,
//    showSystemUi = true)
//@Composable
//fun RegisterScreenPreview(){
//    RegisterScreen(navController = rememberNavController())
//}