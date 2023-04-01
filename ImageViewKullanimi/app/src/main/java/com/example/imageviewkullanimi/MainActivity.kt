package com.example.imageviewkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imageviewkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.resim1.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.image1)
        }
        binding.resim2.setOnClickListener {
            //dinamik şekilde erişmek için
            binding.imageView.setImageResource(resources.getIdentifier("avatar","drawable",packageName))

        }
    }
}