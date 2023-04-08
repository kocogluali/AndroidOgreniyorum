package com.example.snackbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnNormal = findViewById(R.id.btnNormal) as Button
        val btnOzel = findViewById(R.id.btnOzel) as Button
        val btnGeriDonus = findViewById(R.id.btnGeriDonus) as Button

        btnNormal.setOnClickListener {view->
            //snackbar context yerine view yani calistıracak nesneyi ister
            //ayrıca materyal desing 'ı import etmek gerekiyor
            Snackbar.make(view,"Merhaba",Snackbar.LENGTH_SHORT).show()
        }
        btnOzel.setOnClickListener { view->
            val snackbar = Snackbar.make(view,"İnternet Bağlantısı Yok.",Snackbar.LENGTH_SHORT)
            snackbar.setAction("Tekrar Deneyin"){

            }
            snackbar.setTextColor(Color.BLUE)
            snackbar.setActionTextColor(Color.RED)
            snackbar.setBackgroundTint(Color.WHITE)
            snackbar.show()
        }
        btnGeriDonus.setOnClickListener { view ->
            Snackbar.make(view,"Mesaj Silinsin mi ?",Snackbar.LENGTH_SHORT)
                .setAction("EVET"){ y->
                    Snackbar.make(y,"Mesaj Silindi",Snackbar.LENGTH_SHORT).show()
                }
                .show()
        }
    }
}