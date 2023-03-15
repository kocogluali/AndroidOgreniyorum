package com.example.fragmentcalismasiself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        ft.add(R.id.frame_tutucu_1,FragmentFirst())
        ft.add(R.id.frame_tutucu_2,FragmantSecond())
        ft.commit()
    }
}