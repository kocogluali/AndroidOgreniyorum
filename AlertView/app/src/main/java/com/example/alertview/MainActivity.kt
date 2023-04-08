package com.example.alertview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOzel = findViewById<Button>(R.id.btnAlertOzel)
        val btnNormal = findViewById<Button>(R.id.btnAlertNormal)
        btnNormal.setOnClickListener {
            val ad = AlertDialog.Builder(this@MainActivity)
            ad.setMessage("Mesaj")
            ad.setTitle("Baslik")
            ad.setIcon(R.drawable.resim)
            ad.setPositiveButton("Tamam"){dialog, whitch ->
                Toast.makeText(applicationContext, "Tamam Tıklandı", Toast.LENGTH_SHORT).show()
            }
            ad.setNegativeButton("Çık"){dialog, whitch ->
                Toast.makeText(applicationContext, "Çık Tıklandı", Toast.LENGTH_SHORT).show()
            }
            ad.create().show()
        }

        btnOzel.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.alert_tasarim,null)
            val editTextAlert = tasarim.findViewById(R.id.editTextAlert) as EditText
            val ad = AlertDialog.Builder(this@MainActivity)
            ad.setMessage("Mesaj")
            ad.setTitle("Baslik")
            ad.setIcon(R.drawable.resim)
            ad.setView(tasarim)
            ad.setPositiveButton("Kaydet"){dialog, whitch ->
                val getData = editTextAlert.text.toString()
                Toast.makeText(applicationContext,"Alınan veri: $getData", Toast.LENGTH_SHORT).show()
            }
            ad.setNegativeButton("Çık"){dialog, whitch ->
                Toast.makeText(applicationContext, "Çık Tıklandı", Toast.LENGTH_SHORT).show()
            }
            ad.create().show()
        }
    }
}