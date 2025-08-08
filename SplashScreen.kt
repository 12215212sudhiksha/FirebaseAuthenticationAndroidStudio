package com.example.firebaseauthenticationprj

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class SplashScreeen : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screeen)
        image = findViewById(R.id.image1)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Login2::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}



