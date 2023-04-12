package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.toolbar.title = "Özel Toolbar Başlık"
        binding.toolbar.subtitle = "Özel Toolbar AltBaşlık"
        binding.toolbar.setLogo(R.drawable.resim)
        binding.toolbar.setTitleTextColor(resources.getColor(R.color.teal_700))
        setSupportActionBar(binding.toolbar)
    }
}