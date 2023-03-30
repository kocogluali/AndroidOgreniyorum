package com.example.progressbarsliderratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.Toast
import com.example.progressbarsliderratingbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBasla.setOnClickListener {
            binding.progressbar.visibility = View.VISIBLE
        }
        binding.btnDur.setOnClickListener {
            binding.progressbar.visibility = View.INVISIBLE
        }
        binding.seekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
//anlık sonuc
                binding.textView.text = "Sonuc : $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
//dokunmaya basladığım çalışır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
//dokunmayı bıraktığımda çalışır
            }
        })

        binding.btnGoster.setOnClickListener{
            val gelen = binding.ratingBar.rating.toString()
            Toast.makeText(applicationContext,gelen , Toast.LENGTH_SHORT).show()
            }
        }
    }
