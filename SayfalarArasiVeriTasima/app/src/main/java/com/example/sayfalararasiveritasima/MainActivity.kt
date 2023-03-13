package com.example.sayfalararasiveritasima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfalararasiveritasima.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)

        tasarim.buttonGonder.setOnClickListener {

            val kisi = Kisiler(123,"ali",1.77)

            val yeniIntent = Intent(this@MainActivity,ActivityB::class.java)
            yeniIntent.putExtra("mesaj","merhaba")
            yeniIntent.putExtra("yas",23)
            yeniIntent.putExtra("boy",1.78)
            yeniIntent.putExtra("kisiler",kisi)
            startActivity(yeniIntent)

        }
    }
}