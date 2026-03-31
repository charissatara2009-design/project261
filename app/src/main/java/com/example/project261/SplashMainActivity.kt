package com.example.project261

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.splash_main)

        val btn_mulai: Button = findViewById<Button>(R.id.btn_mulai)

        btn_mulai.setOnClickListener {
            val intent = Intent(this, homemainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}