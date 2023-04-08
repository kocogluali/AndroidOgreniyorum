package com.example.popupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import com.example.popupmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var acilirMenu = PopupMenu(this@MainActivity, button)
            acilirMenu.menuInflater.inflate(R.menu.popup_menu, acilirMenu.menu)
            acilirMenu.setOnMenuItemClickListener { item->
                when(item.itemId){
                    R.id.action_sil -> {
                        Toast.makeText(applicationContext, "SIL", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.action_duzenle -> {
                        Toast.makeText(applicationContext, "DUZENLE", Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }

            }
            acilirMenu.show()
        }
    }
    }
