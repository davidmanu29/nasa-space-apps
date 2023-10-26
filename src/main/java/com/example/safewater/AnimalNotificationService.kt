package com.example.safewater

import android.app.NotificationManager
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.annotation.DrawableRes
import androidx.core.app.NotificationCompat
import com.example.nasaspaceapp.R
import kotlin.random.Random

class AnimalNotificationService(
    private val context : Context
) {
    private val notificationManager = context.getSystemService(NotificationManager::class.java)

    fun showBasicNotification(){
        val notification = NotificationCompat.Builder(context, "animalFound")
            .setContentTitle("Animal Found")
            .setContentText("Animal found at your location")
            .setSmallIcon(R.drawable.animal)
            .setPriority(NotificationManager.IMPORTANCE_HIGH)
            .setAutoCancel(true)
            .build()

        notificationManager.notify(
            Random.nextInt(),
            notification
        )
    }

    fun showExpandableNotification(){
        val image = context.bitmapFromResource(R.drawable.animal)
        val notification = NotificationCompat.Builder(context, "animalFound")
            .setContentTitle("Animal Found")
            .setContentText("Animal found at your location")
            .setSmallIcon(R.drawable.animal)
            .setPriority(NotificationManager.IMPORTANCE_HIGH)
            .setLargeIcon(image)
            .setStyle(
                NotificationCompat
                    .BigPictureStyle()
                    .bigPicture(image)
                    .bigLargeIcon(null as Bitmap?)
            )
            .setAutoCancel(true)
            .build()

        notificationManager.notify(
            Random.nextInt(),
            notification
        )

    }
    private fun Context.bitmapFromResource(
        @DrawableRes resId: Int
    ) = BitmapFactory.decodeResource(
        resources,
        resId
    )

}

