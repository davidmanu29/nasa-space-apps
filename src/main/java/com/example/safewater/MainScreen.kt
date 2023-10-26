package com.example.safewater

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nasaspaceapp.R

//@PreviewParameter(showBackground = true)
@Composable
fun MainScreen(navController : NavController) {

    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.backgroun1)
            ,contentDescription = null
            ,modifier = Modifier.fillMaxSize()
            ,contentScale = ContentScale.Crop
        )

        Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Spacer(modifier = Modifier.height(50.dp))

            Text(text = "Safe Water",
                fontSize = 70.sp,
                style = TextStyle(
                    fontFamily = FontFamily.SansSerif,
                    color = Color(0xff6976c7)
                ))

            Spacer(modifier = Modifier.height(200.dp))

            Button(onClick = {
                NavigationActions.navigateTo(navController, ScreenRoutes.LocationScreen)
                              },
                Modifier.width(220.dp)) {

                Text(text = "Global Map",
                    fontSize = 25.sp)
            }

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = { NavigationActions.navigateTo(navController, ScreenRoutes.Species) }, Modifier.width(220.dp)) {

                Text(text = "Species",
                    fontSize = 25.sp)

            }

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = {
                NavigationActions.navigateTo(navController, ScreenRoutes.GoodPractices)
                             }, Modifier.width(220.dp)) {

                Text(text = "Good practices",
                    fontSize = 25.sp)

            }
        }
    }


}
