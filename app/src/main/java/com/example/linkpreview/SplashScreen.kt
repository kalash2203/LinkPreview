package com.example.linkpreview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
                val Intent = Intent(this@SplashScreen,MainActivity::class.java)
                startActivity(Intent)
                finish()

        },2000)
    }
}