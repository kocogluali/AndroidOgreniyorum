package com.example.yasamdongusu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("onCreate","Running")
    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart","Running")
    }

    override fun onResume() {
        Log.e("onResume","Running")
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause","Running")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop","Running")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy","Running")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart","Running")
    }
}