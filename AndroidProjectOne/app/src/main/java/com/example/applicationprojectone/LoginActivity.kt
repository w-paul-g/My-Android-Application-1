package com.example.applicationprojectone

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.applicationprojectone.ui.theme.ApplicationProjectOneTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApplicationProjectOneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column()
                    {
                        TextComponent(value = "Welcome Back!",
                            30.sp,
                            Color.Black,
                            FontFamily.Serif,
                            FontWeight.Bold,
                            TextAlign.Center,)
                        TextComponent(value = "Please Log in",
                            20.sp,
                            Color.DarkGray,
                            FontFamily.SansSerif,
                            FontWeight.ExtraBold,
                            TextAlign.Center)
                        ImageComponent()
                        Spacer(modifier = Modifier.height(5.dp))
                        TextFieldComponent("Enter your email")
                        Spacer(modifier = Modifier.height(5.dp))
                        TextFieldComponent("Enter your password")
                        Spacer(modifier = Modifier.height(5.dp))
                        Button(onClick = {/*TODO*/},
                            colors = ButtonDefaults.buttonColors(Color.Black),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp))
                        {
                            Text(modifier = Modifier.padding(16.dp),text = "LOG IN")
                        }
                        Button(onClick = {
                            val intent = Intent(this@LoginActivity, MainActivity::class.java)
                            startActivity(intent)
                        },
                            colors = ButtonDefaults.buttonColors(Color.Gray),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)) {
                            Text(modifier = Modifier.padding(10.dp),text = "REGISTER HERE")
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview(){
    Column(
//        modifier = Modifier
//            .clip(shape = RoundedCornerShape(20.dp))
//            .border(width = 2.dp, color = Color.Black)
    )
    {
        TextComponent(value = "Welcome Back!",
            30.sp,
            Color.Black,
            FontFamily.Serif,
            FontWeight.Bold,
            TextAlign.Center,)
        TextComponent(value = "Please Log in",
            20.sp,
            Color.DarkGray,
            FontFamily.SansSerif,
            FontWeight.ExtraBold,
            TextAlign.Center)
        ImageComponent()
        Spacer(modifier = Modifier.height(5.dp))
        TextFieldComponent("Enter your email")
        Spacer(modifier = Modifier.height(5.dp))
        TextFieldComponent("Enter your password")
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp))
        {
            Text(modifier = Modifier.padding(16.dp),text = "LOG IN")
        }
        Button(onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(Color.Gray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
            Text(modifier = Modifier.padding(10.dp),text = "REGISTER HERE")
        }
        Spacer(modifier = Modifier.height(5.dp))
    }
}

@Composable
fun ImageComponent(){
    Image(modifier = Modifier
        .wrapContentWidth()
        .fillMaxWidth()
        .height(80.dp),
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "Logo image")
}