package com.example.myapp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp1.ui.theme.MyApp1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp1Theme {
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WelcomePagePreview(){
    WelcomePage()
}

@Composable()
fun WelcomePage() {
    BackgroundImage()
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        Column(modifier = Modifier) {
            Spacer(modifier = Modifier.fillMaxHeight(0.05f))
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)) {
                TravelezyLogo()
            }
            Spacer(modifier = Modifier.fillMaxHeight(0.6f))
            WelcomeBox()
            Spacer(modifier = Modifier.fillMaxHeight(0.1f))
        }
    }
}

@Composable
fun BackgroundImage(){
    Image(painter = painterResource(id = R.drawable.background),
        contentDescription = "Background Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
        )

}


@Composable
fun TravelezyLogo(){
    Text(modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 30.sp,
        color = Color.White,
        text = "travelezy")

}

@Composable
fun WelcomeBox(){
    Box(modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center) {
        Box(modifier = Modifier
            .width(320.dp)
            .padding(1.dp)
            .fillMaxHeight(0.9f)
            .background(Color(0xFF000000))
            .clip(shape = RoundedCornerShape(100.dp)),
            contentAlignment = Alignment.Center){
            Column(modifier = Modifier
                ,
            ){
                IntroText()
                Row(modifier = Modifier.fillMaxWidth()) {
                    SignUpButton(modifier = Modifier)
                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    SignInLink(signInOption = "Already have an account?")
                }
            }
        }
    }
}

//@Composable
//fun WelcomeTexts(){
//    IntroText(introText1 = "Explore the World Here",
//        introText2 = "The best travel app in the world in 2021.Answer of traveller to find their journey"
//    )
//}

@Composable
fun IntroText(){
        Text(fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            textAlign = TextAlign.Center,
            color = Color.White,
            fontSize = 18.sp,
            text = "Explore the World Here")
        Text(fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            color = Color.White,
            fontSize = 15.sp,
            text = "The best travel app in the world in 2021. Answer of traveller to find their journey")

}

@Composable
fun SignUpButton(modifier: Modifier){
    Button(onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(Color.White),
        modifier = Modifier.padding(10.dp)) {
        Text(modifier = Modifier
            .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color(0xFF000000),
            text = "Create an account")
    }
}

@Composable
fun SignInLink(signInOption: String){
    Text(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp),
        textAlign = TextAlign.Center,
        color = Color.White,
        text = signInOption)
}


