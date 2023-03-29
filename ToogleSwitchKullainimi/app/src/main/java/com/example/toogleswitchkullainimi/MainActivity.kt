package com.example.toogleswitchkullainimi
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.example.toogleswitchkullainimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.switch1.setOnCheckedChangeListener { buttonView, b ->
            if (b){
                Toast.makeText(applicationContext, "Switch Enable", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "Switch Disable", Toast.LENGTH_SHORT).show()
            }
        }
        binding.toogleButton.setOnCheckedChangeListener { buttonView, a ->
            if (a){
                Toast.makeText(applicationContext, "Toogle ON", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "Toogle OFF", Toast.LENGTH_SHORT).show()
            }
        }
    }
}