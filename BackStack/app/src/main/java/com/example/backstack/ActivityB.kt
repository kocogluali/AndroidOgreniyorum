package com.example.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.backstack.databinding.ActivityBBinding
import com.example.backstack.databinding.ActivityMainBinding

class ActivityB : AppCompatActivity() {
    private lateinit var tasarim: ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        tasarim = ActivityBBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)

        tasarim.buttonGoToC.setOnClickListener {
            startActivity(Intent(this@ActivityB,ActivityC::class.java))
        }
    }
}