package com.example.mvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_main)
        tasarim.textViewSonuc.text ="0"

        tasarim.buttonToplama.setOnClickListener{
            val sayi1 = tasarim.editTextTextSayi1.text.toString()
            val sayi2 = tasarim.editTextTextSayi2.text.toString()

            val toplam = sayi1.toInt() + sayi2.toInt()
            tasarim.textViewSonuc.text = toplam.toString()
        }

        tasarim.buttonCarpma.setOnClickListener {
            val sayi1 = tasarim.editTextTextSayi1.text.toString()
            val sayi2 = tasarim.editTextTextSayi2.text.toString()
            val toplam = sayi1.toInt() * sayi2.toInt()

            tasarim.textViewSonuc.text = toplam.toString();
        }
    }
}