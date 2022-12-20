package com.ozi.ozan_coskun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstTabButton = findViewById<Button>(R.id.button1)
        val favoriteTabButton = findViewById<Button>(R.id.button2)
        firstTabButton.setOnClickListener{
            val Intent = Intent(this,FirstTab::class.java)
            startActivity(Intent)
        }
        favoriteTabButton.setOnClickListener{
            val Intent = Intent(this,FavoriteTab::class.java)
            startActivity(Intent)
        }

    }

}