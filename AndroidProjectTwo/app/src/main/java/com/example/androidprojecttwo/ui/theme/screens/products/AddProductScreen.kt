package com.example.androidprojecttwo.ui.theme.screens.products


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.androidprojecttwo.data.ProductViewModel
import com.example.androidprojecttwo.navigation.ROUTE_VIEW_PRODUCTS

@Composable
fun AddProductScreen(navController: NavHostController){
    Box(
        modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Add product",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red,
                modifier = Modifier.padding(20.dp),
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline
            )

            var productName by remember { mutableStateOf(TextFieldValue("")) }
            var productQuantity by remember { mutableStateOf(TextFieldValue("")) }
            var productPrice by remember { mutableStateOf(TextFieldValue("")) }

            OutlinedTextField(
                value = productName,
                onValueChange = { productName = it },
                label = { Text(text = "Product name *") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = productQuantity,
                onValueChange = { productQuantity = it },
                label = { Text(text = "Product quantity *") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = productPrice,
                onValueChange = { productPrice = it },
                label = { Text(text = "Product price *") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Spacer(modifier = Modifier.height(20.dp))
            var context = LocalContext.current
            Button(onClick = {

                val productRepository = ProductViewModel(navController,context)
                productRepository.saveProduct(productName.text.trim(),productQuantity.text.trim(),
                    productPrice.text)
                navController.navigate(ROUTE_VIEW_PRODUCTS)


            }) {
                Text(text = "Save")
            }
        }
    }

}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun AddProductScreenPreview(){
    AddProductScreen(navController = rememberNavController())
}