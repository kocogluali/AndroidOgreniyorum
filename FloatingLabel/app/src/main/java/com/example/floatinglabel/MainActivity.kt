package com.example.floatinglabel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.floatinglabel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnYap.setOnClickListener {
            val name = binding.editTextName.text.toString().trim()
            val phone = binding.editTextPhone.text.toString().trim() //önünde ve arkasındaki boşlukları siler

            if (TextUtils.isEmpty(name)){
                Toast.makeText(applicationContext, "Ad Girmediniz", Toast.LENGTH_SHORT).show()
                return@setOnClickListener //butonun calismasini durdur yapıyor
            }
            if (TextUtils.isEmpty(phone)){
                Toast.makeText(applicationContext, "Telefon Girmediniz", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (phone.length<6){
                Toast.makeText(applicationContext, "Tel en az 6 hane olmalıdır", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(applicationContext, "Adınız: $name Telefonunuz: $phone", Toast.LENGTH_SHORT).show()
        }
    }
}