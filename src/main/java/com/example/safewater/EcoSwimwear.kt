package com.example.safewater.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
fun EcoSwimwear(navController: NavController) {
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(DiaBlueArticles)
        .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(text = "Choose the right swimwear",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                color = Color.White)
            Spacer(Modifier.height(30.dp))
        }
        item {
            Text(text = "Everyone loves summer, getting that swimwear and going to the beach. However, you might not know that the stretchy, elastic suits you buy are filled with plastic, and every time you wash one or toss it out, it’s contributing to our ocean’s plastic problem. \n" +
                    "\n" +
                    "In addition, the color from these can come out of the material and will spread in the water. Fish will swallow the infected water. That’s why these days, the elusive “itsy-bitsy teeny-weeny yellow-polka-dot bikini” is being reimagined and restructured in big ways for a modern world in the face of climate change. \n" +
                    "\n" +
                    "Some ideas of eco-friendly swimsuits:\n",
                fontSize = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Justify)
            Spacer(Modifier.height(10.dp))
        }
        item {
            Swimwear(brand = "1. Summersalt",
                text = "Its swim fabrics are made with 78% recycled polyamide and use recycled materials including nylon waste to make pieces that offer 50 SPF protection.",
                image = R.drawable.summersalt)
        }
        item {
            Swimwear(brand = "2. Ookioh",
                text = "All the products are all made from a recycled fabric using ocean waste (like thrown-out fishing nets) and non-toxic colors.",
                image = R.drawable.ookioh)
        }
        item {
            Swimwear(brand = "3. Mara Hoffman’s ",
                text = "Mara Hoffman’s swimsuits are vibrantly colorful, inclusively sized (up to a 3XL) and incorporate eco-friendly design elements, like upcycling deadstock fabric for colorblocked swimsuits or using a blend of recycled materials.",
                image = R.drawable.mara)
        }
    }
}

@Composable
fun Swimwear(
    brand: String,
    text: String,
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