package com.example.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.backstack.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {
    private lateinit var tasarim:ActivityCBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityCBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)

        tasarim.buttonGoToD.setOnClickListener {
            startActivity(Intent(this@ActivityC,ActivityD::class.java))
        }
    }
}