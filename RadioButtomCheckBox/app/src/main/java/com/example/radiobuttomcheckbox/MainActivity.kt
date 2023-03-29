package com.example.radiobuttomcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import com.example.radiobuttomcheckbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val kotlinSelected = binding.radioButtonKotlin.isChecked
        val flutterSelected = binding.radioButtonFlutter.isChecked
        val swiftSelected = binding.radioButtonSwift.isChecked
        val kotlinCheckBox = binding.kotlin.isChecked
        val csharpCheckBox = binding.csharp.isChecked
        val flutterCheckBox = binding.flutter.isChecked


        binding.checkboxSelected.setOnClickListener {
            if (kotlinCheckBox==true){
                Toast.makeText(applicationContext, "kotlin", Toast.LENGTH_SHORT).show()
            }
            if (csharpCheckBox==true){
                Toast.makeText(applicationContext, "csharp", Toast.LENGTH_SHORT).show()
            }
            if (flutterCheckBox==true){
                Toast.makeText(applicationContext, "flutter", Toast.LENGTH_SHORT).show()
            }
        }


        binding.radioButtonKotlin.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked==kotlinSelected){
                Toast.makeText(applicationContext, "Conguralitation Kotlin", Toast.LENGTH_SHORT).show()
            }
            if (isChecked==flutterSelected){
                Toast.makeText(applicationContext, "Conguralitation Flutter", Toast.LENGTH_SHORT).show()
            }
            if(isChecked==swiftSelected){
                Toast.makeText(applicationContext, "Conguralitation Swift :)", Toast.LENGTH_SHORT).show()
            }
        }
    }
}