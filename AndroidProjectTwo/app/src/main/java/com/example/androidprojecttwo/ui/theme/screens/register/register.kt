package com.example.androidprojecttwo.ui.theme.screens.register

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
    RegisterForm(navController = rememberNavController())
}

@Composable
fun RegisterForm(navController: NavController){
    Box(modifier = Modifier
        .fillMaxWidth(),
        contentAlignment = Alignment.Center){
        Column(modifier = Modifier
            .width(320.dp)) {
            Row {
                //Text
                RegisterScreenText(registerScreenText = "Welcome",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold)
            }
            Row {
                RegisterScreenText(registerScreenText = "Please Register",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Normal
                )
            }
            Row {
                NameFields(nameField = "First Name")
            }
            Row{
                NameFields(nameField = "Middle Name")
            }
            Row {
                NameFields(nameField = "Last Name")
            }
            Row {
                NameFields(nameField = "Surname")
            }
            Row {
                PhoneNumberField(phoneNumberField = "Enter your Phone Number")
            }
            Row {
                EmailField(emailField = "Enter your Email")
            }
            Row {
                PasswordFieldCreate(createPassword = "Enter your Password")
            }
            Row {
                RegisterScreenText(registerScreenText = "Note: Ensure that your Password contains at least two Uppercase letters," +
                        " two numbers and two non-alphanumeric character",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light
                )
            }
            Row {
                PasswordFieldConfirm(confirmPassword = "Confirm your Password")
            }
            Row {
                SignUpButton(navController = rememberNavController())
            }
            Row {
                RegisterScreenText(registerScreenText = "Already have an account?",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal)
            }
            Row {
                LogInButton(navController = rememberNavController())
            }
        }
    }

}

@Composable
fun RegisterScreenText(registerScreenText: String,
                       fontSize: TextUnit,
                       fontWeight: FontWeight){
    Text(text = registerScreenText,
        textAlign = TextAlign.Left,
        fontSize = fontSize,
        fontWeight = fontWeight,
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp)
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
    Button(onClick = {
        navController.navigate(ROUTE_LOGIN)
    },
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)) {
        Text(text = "LOGIN")
    }
}

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun RegisterScreenPreview(){
    RegisterScreen(navController = rememberNavController())
}