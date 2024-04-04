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
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidprojectone.ui.theme.AndroidProjectOneTheme

class ShortcutsSection1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectOneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Row{
                            TopBar()
                        }

                        Spacer(modifier = Modifier.height(1.dp))
                        Button(
                            onClick = {
                                val intent = Intent(
                                    this@ShortcutsSection1,
                                    ScrollActivity::class.java
                                )
                                startActivity(intent)
                            },
                            colors = ButtonDefaults.buttonColors(Color.Black),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        ) {
                            Text(modifier = Modifier.padding(5.dp), text = "ScrollActivity")
                        }
                        Spacer(modifier = Modifier.height(1.dp))
                        Button(onClick = {
                            val intent = Intent(
                                this@ShortcutsSection1,
                                CardActivity::class.java
                            )
                            startActivity(intent)
                        },
                            colors = ButtonDefaults.buttonColors(Color.Gray),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        ) {
                            Text(modifier = Modifier.padding(5.dp),text = "Card Activity")
                        }
                        Spacer(modifier = Modifier.height(1.dp))
                        Button(
                            onClick = {
                                val intent = Intent(this@ShortcutsSection1, LoginActivity::class.java)
                                startActivity(intent)
                            },
                            colors = ButtonDefaults.buttonColors(Color.Gray),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        )
                        {
                            Text(modifier = Modifier.padding(5.dp), text = "LOG IN HERE")
                        }
                        Spacer(modifier = Modifier.height(1.dp))
                        Button(onClick = {
                            val intent = Intent(this@ShortcutsSection1, MainActivity::class.java)
                            startActivity(intent)
                        },
                            colors = ButtonDefaults.buttonColors(Color.Gray),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)) {
                            Text(modifier = Modifier.padding(10.dp),text = "REGISTER HERE")
                        }
                        Spacer(modifier = Modifier.height(1.dp))
                        Button(onClick = {
                            val intent = Intent(this@ShortcutsSection1, TopBarAppActivity::class.java)
                            startActivity(intent)
                        },
                            colors = ButtonDefaults.buttonColors(Color.Gray),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp))
                        {
                            Text(text = "TOP BAR" )
                        }
                        Button(onClick = {
                            val intent = Intent(this@ShortcutsSection1, BottomAppActivity::class.java)
                            startActivity(intent)
                        },
                            colors = ButtonDefaults.buttonColors(Color.Gray),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp))
                        {
                            Text(text = "TOP BAR" )
                        }
                        Row {
                            BottomAppBarExample()
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShortcutsSectionPreview(){
    Column {
        Spacer(modifier = Modifier.height(1.dp))
        Button(
            onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(modifier = Modifier.padding(5.dp), text = "ScrollActivity")
        }
        Spacer(modifier = Modifier.height(1.dp))
        Button(onClick = {/*TODO*/}) {

        }
        Spacer(modifier = Modifier.height(1.dp))
        Button(
            onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(Color.Gray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
        {
            Text(modifier = Modifier.padding(5.dp), text = "LOG IN HERE")
        }
        Spacer(modifier = Modifier.height(1.dp))
        Button(onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(Color.Gray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
            Text(modifier = Modifier.padding(10.dp),text = "REGISTER HERE")
        }
        Spacer(modifier = Modifier.height(1.dp))
    }
}



