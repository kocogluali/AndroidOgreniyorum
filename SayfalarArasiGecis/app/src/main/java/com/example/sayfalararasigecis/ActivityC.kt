package com.example.sayfalararasigecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfalararasigecis.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {
    private  lateinit var tasarim:ActivityCBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityCBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)
    }

    override fun onBackPressed() {
        val yeniIntent=Intent(this@ActivityC,MainActivity::class.java)
        startActivity(yeniIntent)
    }
}