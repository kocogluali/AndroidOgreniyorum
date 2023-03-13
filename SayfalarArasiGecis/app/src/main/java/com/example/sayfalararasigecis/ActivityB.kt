package com.example.sayfalararasigecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfalararasigecis.databinding.ActivityBBinding
import com.example.sayfalararasigecis.databinding.ActivityMainBinding

class ActivityB : AppCompatActivity() {
    private lateinit var tasarim:ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityBBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)

        tasarim.buttonGoToC.setOnClickListener {
            val yeniIntent = Intent(this@ActivityB,ActivityC::class.java)
            startActivity(yeniIntent)
        }
    }
}