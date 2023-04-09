package com.example.darkmode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnNormal = findViewById<Button>(R.id.btnNormal)
        val btnDark = findViewById<Button>(R.id.btnDark)

        btnNormal.setOnClickListener {
            delegate.localNightMode  = AppCompatDelegate.MODE_NIGHT_NO
        }
        btnDark.setOnClickListener {
            delegate.localNightMode  = AppCompatDelegate.MODE_NIGHT_YES
        }
    }
}