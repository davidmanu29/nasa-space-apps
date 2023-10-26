package com.example.safewater.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nasaspaceapp.R
import com.example.safewater.NavigationActions
import com.example.safewater.ScreenRoutes

@Composable
fun GoodPractice(navController: NavController) {
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(DiaBlueBackground)
        .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(text = "Eco-friendly solutions",
                fontSize = 35.sp,
                color = Color.White)
            Spacer(Modifier.height(20.dp))
        }
        item {
            Article(
                R.drawable.sunscreens,
                "Use a suitable sunscreen",
                "Using eco-friendly sunscreen can help save our coral reefs and prevent harm to wildlife. However, you must know...",
                onClick = {
                    NavigationActions.navigateTo(navController, ScreenRoutes.SuitableSunscreen)
                }
            )
            Spacer(Modifier.height(8.dp))
        }
        item {
            Article(
                R.drawable.swimwear,
                "Choose the right swimwear",
                "Sustainable Swimwear is typically made from recycled or natural materials. Recycled materials are typically the best choice...",
                onClick = {
                    NavigationActions.navigateTo(navController, ScreenRoutes.EcoSwimwear)
                }
            )
            Spacer(Modifier.height(8.dp))
        }
    }
}

@Composable
fun Article(
    imageId: Int,
    title: String,
    description: String,
    onClick: ()->Unit
) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .height(400.dp)
        .clip(RoundedCornerShape(20.dp))
        .background(DiaBlueArticles)
        .padding(8.dp)) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .clip(RoundedCornerShape(20.dp))) {
            Image(painter = painterResource(id = imageId),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)
            IconButton(onClick = { onClick() },
                Modifier.align(Alignment.BottomEnd)) {
                Icon(imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    Modifier.size(50.dp))
            }
        }
        Spacer(Modifier.height(20.dp))
        Text(text = title,
            fontSize = 25.sp,
            color = Color.White)
        Spacer(Modifier.height(10.dp))
        Text(text = description,
            fontSize = 15.sp,
            color = Color.White,
            textAlign = TextAlign.Justify)
    }
}
