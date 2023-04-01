package com.example.timepickerdatepicker


import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.timepickerdatepicker.databinding.ActivityMainBinding
import java.util.Calendar


class MainActivity : AppCompatActivity(){
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.editTextSaat.setOnClickListener {
            val calendar = Calendar.getInstance()
            val saat = calendar.get(Calendar.HOUR_OF_DAY)
            val dakika = calendar.get(Calendar.MINUTE)
            val timePicker = TimePickerDialog(this@MainActivity,TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                binding.editTextSaat.setText("$hourOfDay : $minute")
            },saat,dakika,true)
            timePicker.setTitle("Saat Seçiniz")
            timePicker.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarla",timePicker)
            timePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"İptal",timePicker)
            timePicker.show()
        }
        binding.editTextTarih.setOnClickListener {
            val calendar = Calendar.getInstance()
            val yil = calendar.get(Calendar.YEAR)
            val ay = calendar.get(Calendar.MONDAY)
            val gun = calendar.get(Calendar.DAY_OF_MONTH)

            val datePicker = DatePickerDialog(this@MainActivity,DatePickerDialog.OnDateSetListener { datePicker, year, month, dayOfMonth ->
                binding.editTextTarih.setText("$year/${month+1}/$dayOfMonth")
            },yil,ay,gun)
            datePicker.setTitle("Tarih Seçiniz")
            datePicker.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarla",datePicker)
            datePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"İptal",datePicker)
            datePicker.show()
        }
    }
}