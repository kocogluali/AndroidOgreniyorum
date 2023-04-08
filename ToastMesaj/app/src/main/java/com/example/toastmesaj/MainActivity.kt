package com.example.toastmesaj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.toastmesaj.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnNormal.setOnClickListener {
            Toast.makeText(applicationContext, "Merhaba", Toast.LENGTH_SHORT).show()
        }

        binding.btnOzel.setOnClickListener {
            val tasarim =layoutInflater.inflate(R.layout.toast_tasarim,null)
            val textViewMesaj = tasarim.findViewById(R.id.textViewMesaj) as TextView

            textViewMesaj.text ="Merhaba Özel Mesaj"

            val toastOzel = Toast(applicationContext)
            toastOzel.view = tasarim
        }
    }
}