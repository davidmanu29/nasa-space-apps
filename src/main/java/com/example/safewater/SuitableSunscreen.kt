package com.example.safewater.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nasaspaceapp.R

@Composable
fun SuitableSunscreen(navController: NavController) {
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(DiaBlueArticles)
        .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(text = "Use a suitable sunscreen",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                color = Color.White)
            Spacer(Modifier.height(30.dp))
        }
        item {
            Text(text = "Using eco-friendly sunscreen can help save our coral reefs and prevent harm to wildlife. However, you must know how to find the right sunscreen for you and your family and not get tricked by marketing tactics. \n" +
                    "\n" +
                    "70% of sunscreens on the U.S. market contain harsh chemicals, such as oxybenzone and octinoxate. These chemicals can damage or kill coral reefs, causing irrevocable harm. \n" +
                    "\n" +
                    "The most popular eco-friendly and reef-safe sunscreen brands are: \n",
                fontSize = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Justify)
            Spacer(Modifier.height(10.dp))
        }
        item {
            SunScreen(brand = "1. Sun Bum Original SPF 50 Sunscreen",
                image = R.drawable.sunscreen1_transparent)
        }
        item {
            SunScreen(brand = "2. Thinksport SPF 50 Mineral Sunscreen",
                image = R.drawable.sunscreen2_transparent)
        }
        item {
            SunScreen(brand = "3. Badger Kids Reef Safe Sunscreen",
                image = R.drawable.sunscreen3_transparent)
        }
        item {
            SunScreen(brand = "4. Babo Botanicals Sheer Mineral Sunscreen Lotion SPF 50",
                image = R.drawable.sunscreen4_transparent)
        }
    }
}
@Composable
fun SunScreen(
    brand: String,
    image: Int
) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .height(300.dp)
        .clip(RoundedCornerShape(20.dp))
        .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = brand,
            fontSize = 20.sp,
            color = Color.White)
        Spacer(Modifier.height(20.dp))
        Image(painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier.size(250.dp),
            contentScale = ContentScale.Crop)
        Spacer(Modifier.height(20.dp))
    }

}