package com.example.androidprojectone

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprojectone.ui.theme.AndroidProjectOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectOneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    Column()
                    {
                        //TopBar()
                        ImageComponent()
                        TextComponent(value = "Hey there",
                            25.sp,
                            Color.Black,
                            FontFamily.Serif,
                            FontWeight.Bold,
                            TextAlign.Center,)
                        TextComponent(value = "Please register",
                            15.sp,
                            Color.DarkGray,
                            FontFamily.SansSerif,
                            FontWeight.ExtraBold,
                            TextAlign.Center)
                        Spacer(modifier = Modifier.height(1.dp))
                        TextFieldComponent("Enter your Name")
                        Spacer(modifier = Modifier.height(1.dp))
                        TextFieldComponent("Enter your Location")
                        Spacer(modifier = Modifier.height(1.dp))
                        TextFieldComponent("Enter your email")
                        Spacer(modifier = Modifier.height(1.dp))
                        TextFieldComponent("Enter your password")
                        Spacer(modifier = Modifier.height(1.dp))
                        CheckboxComponent(value = "I have Agreed to the Terms of Service and Privacy Policy")
                        Button(onClick = {
                            val intent = Intent(this@MainActivity,
                                ScrollActivity::class.java)
                            startActivity(intent)
                        },
                            colors = ButtonDefaults.buttonColors(Color.Black),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)) {
                            Text(modifier = Modifier.padding(5.dp),text = "REGISTER")
                        }
                        Spacer(modifier = Modifier.height(1.dp))
                        Button(onClick = {
                            val intent = Intent(this@MainActivity, LoginActivity::class.java)
                            startActivity(intent)
                        },
                            colors = ButtonDefaults.buttonColors(Color.Gray),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp))
                        {
                            Text(modifier = Modifier.padding(5.dp),text = "LOG IN HERE")
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Button(onClick = {
                            val intent = Intent(this@MainActivity, BottomAppActivity::class.java)
                            startActivity(intent)
                        },
                            colors = ButtonDefaults.buttonColors(Color.Gray),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp))
                        {
                            Text(modifier = Modifier.padding(5.dp),text = "BOTTOM APP BAR")
                        }

                    }
                }

            }

        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HelloClientPreview(){
    Column(
//        modifier = Modifier
//            .clip(shape = RoundedCornerShape(20.dp))
//            .border(width = 2.dp, color = Color.Black)
    )
    {
        ImageComponent()
        TextComponent(value = "Hey there",
            25.sp,
            Color.Black,
            FontFamily.Serif,
            FontWeight.Bold,
            TextAlign.Center,)
        TextComponent(value = "Please register",
            15.sp,
            Color.DarkGray,
            FontFamily.SansSerif,
            FontWeight.ExtraBold,
            TextAlign.Center)
        Spacer(modifier = Modifier.height(1.dp))
        TextFieldComponent("Enter your Name")
        Spacer(modifier = Modifier.height(1.dp))
        TextFieldComponent("Enter your Location")
        Spacer(modifier = Modifier.height(1.dp))
        TextFieldComponent("Enter your email")
        Spacer(modifier = Modifier.height(1.dp))
        TextFieldComponent("Enter your password")
        Spacer(modifier = Modifier.height(1.dp))
        CheckboxComponent(value = "I have Agreed to the Terms of Service and Privacy Policy")
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
            Text(modifier = Modifier.padding(5.dp),text = "REGISTER")
        }
        Spacer(modifier = Modifier.height(1.dp))
        Button(onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(Color.Gray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp))
        {
            Text(modifier = Modifier.padding(5.dp),text = "LOG IN HERE")
        }
        Spacer(modifier = Modifier.height(1.dp))
    }
}


@Composable
fun TextComponent(value: String,
                  size: TextUnit,
                  colorValue: androidx.compose.ui.graphics.Color,
                  fontFamilyValue: FontFamily,
                  fontWeightValue: FontWeight,
                  textAlignValue: TextAlign
)
{
    Text(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight(align = Alignment.Top)
        .padding(10.dp),
        text = value,
        fontSize = size,
        color = colorValue,
        fontFamily = fontFamilyValue,
        fontWeight = fontWeightValue,
        textAlign = textAlignValue

    )
}

@Composable
fun TextFieldComponent(mylabel:String){
    Row (modifier = Modifier
        .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        var text by remember {
            mutableStateOf(value = "")
        }
        TextField(modifier = Modifier.fillMaxWidth(),
            value = text, onValueChange = {
                    newText -> text = newText
            },
            label = { TextFieldsLabels(value = mylabel)}
        )
    }

}

@Composable
fun TextFieldsLabels(value: String){
    Text(text = value)
}


@Composable
fun CheckboxComponent(value: String){
    Row (modifier = Modifier
        .fillMaxWidth()
        .heightIn(50.dp)
        .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val checkedState = remember {
            mutableStateOf(value = false)
        }
        Checkbox(checked = checkedState.value, onCheckedChange = {
        })
        TextFieldsLabels(value = value)
    }
}

