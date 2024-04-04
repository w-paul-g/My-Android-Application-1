package com.example.androidprojectone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprojectone.ui.theme.AndroidProjectOneTheme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectOneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val employees = listOf(
                        "Mutheu", "Veronica",
                        "Njogu", "Dennis",
                        "John", "Paul",
                        "Vincent", "Ann",
                        "Joseph", "King",
                        "Indiana", "Sasha",
                        "Malia", "Scholes",
                        "Andrew"
                    )
                    ListScreen(modifier = Modifier, employees)
                    val courses = listOf(
                        "Marketing",
                        "Full Stack Software Development",
                        "CyberSecurity",
                        "Data Science",
                        "Java",
                        "Python",
                        "USSD",

                        )
                    ListOfCourses(modifier = Modifier, courses)

//                    Button(onClick = {
//                        val intent = Intent(this@ScrollActivity,
//                            LoginActivity::class.java)
//                        startActivity(intent)
//                        },
//                        modifier = Modifier
//                            .fillMaxWidth()
//                    ) {
//                        Text(modifier = Modifier
//                            .padding(15.dp),
//                            text = "LOG IN HERE")
//                    }
                }
            }
        }
    }
}

@Composable
fun ListScreen(modifier: Modifier = Modifier, employees: List<String>){
    Box(modifier = Modifier
        .fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.background),
            contentDescription = "Background Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .matchParentSize())
    }
    Column() {
        LazyRow(contentPadding = PaddingValues(10.dp)) {
            items(items = employees){
                    item->
                RowCard(modifier = Modifier, name = item)
            }

        }
        LazyColumn(contentPadding = PaddingValues(10.dp)) {
            items(items = employees){
                    item->
                ColumnCard(modifier = Modifier, name = item)
            }

        }

    }
}

@Composable
fun ListOfCourses(modifier: Modifier = Modifier, courses: List<String> ){
    Column {
        LazyColumn(contentPadding = PaddingValues(10.dp)) {

            items(items = courses){
                    item->
                ColumnCard2(modifier = Modifier, name = item)
            }

        }
    }
}


//@PreviewParameter
//@Composable
//fun ListScreenPreview(modifier: Modifier = Modifier, employees: List<String>){
//    ListScreen(modifier = Modifier, employees)
//}

@Composable
fun RowCard(modifier: Modifier, name :String){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(100.dp)
            .aspectRatio(1.5f),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun ColumnCard(modifier: Modifier, name: String){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight()
            .aspectRatio(1.5f),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun ColumnCard2(modifier: Modifier, name: String){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight()
            .aspectRatio(1.5f),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold)
        }
    }
}
