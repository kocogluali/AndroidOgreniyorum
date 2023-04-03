package com.example.sayitahminet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sayitahminet.databinding.ActivityMainBinding
import com.example.sayitahminet.databinding.ActivityTasarimBinding
import kotlin.random.Random


class TasarimActivity : AppCompatActivity() {
    private var rastGelesayi=0
    private var sayac=5
    lateinit var binding: ActivityTasarimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTasarimBinding.inflate(layoutInflater)
        setContentView(binding.root)
        rastGelesayi = Random.nextInt(101)

        Toast.makeText(applicationContext, "${rastGelesayi.toString()}", Toast.LENGTH_SHORT).show()

        binding.btnTahmin.setOnClickListener {
             //backstackten siler
           //
            sayac-=1
            val tahmin = binding.editTextGirdi.text.toString().toInt()

            if(tahmin==rastGelesayi){
                val intent = Intent(this@TasarimActivity,SonucActivity::class.java)
                intent.putExtra("sonuc",true)
                finish()
                startActivity(intent)

            }
            if (tahmin>rastGelesayi){
                Toast.makeText(applicationContext, "Sayıyı azalt", Toast.LENGTH_SHORT).show()
            }
            if (tahmin<rastGelesayi){
                Toast.makeText(applicationContext, "Sayıyı artır", Toast.LENGTH_SHORT).show()
            }
            if (sayac==0){

                val intent = Intent(this@TasarimActivity,SonucActivity::class.java)
                intent.putExtra("sonuc",false)
                finish()
                startActivity(intent)
            }
        }
    }
}