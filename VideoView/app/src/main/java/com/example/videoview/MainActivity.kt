package com.example.videoview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.videoview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
       //start
        binding.btnStart.setOnClickListener {
            val adress=Uri.parse("android.resource://"
                    + packageName + "/" + R.raw.video)
            binding.videoView.setVideoURI(adress)
            binding.videoView.start()
        }
        //stop
        binding.btnStart.setOnClickListener {
           binding.videoView.stopPlayback()
        }
    }
}