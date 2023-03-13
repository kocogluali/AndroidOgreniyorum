package com.example.sayfalararasigecis

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfalararasigecis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)
        tasarim.buttonGoToB.setOnClickListener {
            val yeniIntent = Intent(this@MainActivity,ActivityB::class.java)
            startActivity(yeniIntent)
        }
    }
}

