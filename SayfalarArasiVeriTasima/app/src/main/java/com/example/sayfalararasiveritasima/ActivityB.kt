package com.example.sayfalararasiveritasima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sayfalararasiveritasima.databinding.ActivityBBinding
import com.example.sayfalararasiveritasima.databinding.ActivityMainBinding

class ActivityB : AppCompatActivity() {
    private lateinit var tasarim: ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityBBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)

        val gelenMesaj = intent.getStringExtra("mesaj")
        val gelenYas= intent.getIntExtra("yas",0)
        val gelenBoy = intent.getDoubleExtra("boy",1.7)

        val gelenKisiler = intent.getSerializableExtra("kisiler") as Kisiler


        Log.e("MESAJ",gelenMesaj.toString())
        Log.e("YAS",gelenYas.toString())
        Log.e("BOY",gelenBoy.toString())
        Log.e("Kisi Adı",gelenKisiler.isim.toString())
        Log.e("Kisi Tc",gelenKisiler.tcNo.toString())
        Log.e("Kisi Boy",gelenKisiler.boy.toString())
    }
}