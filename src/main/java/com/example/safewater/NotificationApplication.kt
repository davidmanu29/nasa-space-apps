package com.example.safewater

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.annotation.RequiresApi


class NotificationApplication : Application(){


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate() {
        super.onCreate()

        val notificationChannel = NotificationChannel(
            "animalFound",
            "animalReminderChannel",
            NotificationManager.IMPORTANCE_HIGH
        )

        notificationChannel.description = "Notification channel for animal search"
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(notificationChannel)
    }
}