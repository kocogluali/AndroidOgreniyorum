package com.example.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.backstack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)


        tasarim.buttonGoToB.setOnClickListener {
            val intent = Intent(this@MainActivity,ActivityB::class.java)
            startActivity(intent)
        }
    }
}