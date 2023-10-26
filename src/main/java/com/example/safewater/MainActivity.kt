package com.example.safewater

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.app.NotificationCompat
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nasaspaceapp.R
import com.example.safewater.ui.theme.SafeWaterTheme
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberPermissionState
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPermissionsApi::class)
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            SafeWaterTheme {
//                val navController = rememberNavController()
//                Navigation(navController)
//            }
            val navController = rememberNavController()
            Navigation(navController)
//            val notificationChannel = NotificationChannel(
//                "water_notification", // id
//                "Water", // name
//                NotificationManager.IMPORTANCE_HIGH // importance
//            )
//            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
//            notificationManager.createNotificationChannel(notificationChannel)
//            val notificationPermissionState =
//                rememberPermissionState(
//                    permission = Manifest.permission.POST_NOTIFICATIONS
//                )
//
//            val waterNotificationService = remember {
//                WaterNotificationService(this)
//            }
        }
    }
}

class WaterNotificationService(
    private val context: Context
){
    fun showBasicNotification() {
        val notification = NotificationCompat.Builder(context, "water_notification")
            .setSmallIcon(R.drawable.backgroun1)
            .setContentTitle("Drink some water!")
            .setContentText("It passed one hour since you drank some water")
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            // Dissapears after clicking the notification
            .setAutoCancel(true)
            .build()

        val notificationManager = context.getSystemService(NotificationManager::class.java)
        notificationManager.notify(Random.nextInt(), notification)
    }
}


