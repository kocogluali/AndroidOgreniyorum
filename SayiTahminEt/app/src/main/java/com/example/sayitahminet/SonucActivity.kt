package com.example.sayitahminet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sayitahminet.databinding.ActivityMainBinding
import com.example.sayitahminet.databinding.ActivitySonucBinding

class SonucActivity : AppCompatActivity() {
    lateinit var binding:ActivitySonucBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySonucBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnTekrar.setOnClickListener {
            startActivity(Intent(this@SonucActivity,MainActivity::class.java))
        }

        val sonuc = intent.getBooleanExtra("sonuc",false)
        Toast.makeText(applicationContext, sonuc.toString(), Toast.LENGTH_SHORT).show()
        if (sonuc==true){
            binding.textViewSonuc.text="KAZANDINIZ"
            binding.imageViewSonuc.setImageResource(R.drawable.mutlu_resim)
        }else{
            binding.textViewSonuc.text="KAYBETTİNİZ"
            binding.imageViewSonuc.setImageResource(R.drawable.uzgur_resim)
        }
    }
}