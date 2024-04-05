package com.example.myapplicationone

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.ScrollView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationone.ui.theme.GreenLight1
import com.example.myapplicationone.ui.theme.MyApplicationOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationOneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WelcomePage()
                }
            }
        }
    }
}

@Composable
fun WelcomePage(){
    BackgroundImage()
    Box {
        Column {
            Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp))
            Row {
                Title()
            }
            Row {
                Slogan()
            }
            Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp))
            Box {
                      SignInButtons()
            }
            Spacer(modifier = Modifier
                 .fillMaxWidth()
                 .height(20.dp))
            Box {
                SignUpLink()
            }
            Spacer(modifier = Modifier
                      .fillMaxWidth()
                      .height(20.dp))
            Box {
                 UsageAgreement()
            }
            Spacer(modifier = Modifier
                      .fillMaxWidth()
                      .height(20.dp))
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WelcomePagePreview(){
    WelcomePage()
}

@Composable
fun BackgroundImage(){
    Box() {
        Image(painter = painterResource(id = R.drawable.treehouse),
            contentDescription = "Backgroumd",
            contentScale = ContentScale.Crop,
            //modifier = Modifier.matchParentSize()
        )
    }
}


@Composable
fun Title(){
    Box(modifier = Modifier.padding(20.dp))
    {
    Text(modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        color = Color.White,
        fontSize = 40.sp,
        text = "Wanderly"
        )
    }
}

@Composable
fun Slogan(){
    Box(modifier = Modifier.padding(2.dp)){
    Text(modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        color = Color.White,
        fontSize = 20.sp,
        text = "Your ultimate Companion for Seamless Travel Experiences")
    }
}

@Composable
fun SignInButtons(){
    Box(modifier = Modifier.fillMaxWidth()){
        Column() {
            Row() {
                SignInWithPhoneNumberButton()
            }
            Row() {
                SignInWithAppleButton()
            }

        }
    }
}
@Composable
fun SignInWithPhoneNumberButton(){
    Box(modifier = Modifier
        .fillMaxWidth(),
        contentAlignment = Alignment.Center){
    Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .width(300.dp)
            .wrapContentHeight()
            .padding(10.dp),
        colors = ButtonDefaults.buttonColors(GreenLight1)) {
        Text(text = "Sign in with Phone Number", modifier = Modifier.padding(8.dp))
    }}
}
@Composable
fun SignInWithAppleButton(){
    Box(modifier = Modifier
        .fillMaxWidth(),
        contentAlignment = Alignment.Center ){
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .width(300.dp)
                .wrapContentHeight()
                .padding(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF000000))) {
            //Icon(painter = painterResource(id = R.drawable.AppleLogo))
            Text(text = "Sign in With Apple", modifier = Modifier.padding(8.dp))
        }
    }
}
@Composable
fun SignUpLink(){
    Box {
        Text(modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.White,
            fontSize = 15.sp,
            text = "Don't have an account? Sign Up")
    }
}

@Composable
fun UsageAgreement(){
    Box(modifier = Modifier
        .fillMaxWidth()) {
        Text(modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.White,
            fontSize = 15.sp,
            text = "By Creating an account or signing in, you agree to our Terms of Service and Privacy Policy.")
    }
}