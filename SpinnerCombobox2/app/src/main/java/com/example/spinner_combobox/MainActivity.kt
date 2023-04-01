package com.example.spinner_combobox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.spinner_combobox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private  val ulkeler = ArrayList<String>()
    private lateinit var veriAdaptoru:ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        ulkeler.add("Türkiye")
        ulkeler.add("Almanya")
        ulkeler.add("Çin")
        ulkeler.add("İtalya")
        ulkeler.add("Japonya")
        ulkeler.add("Portekiz")
        ulkeler.add("İspanya")

        veriAdaptoru = ArrayAdapter(this@MainActivity,android.R.layout.simple_list_item_1,android.R.id.text1,ulkeler)
        binding.spinner.adapter = veriAdaptoru

        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext, "Seçilen ülke: ${ulkeler[position]}", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
//bir şey seçmezse kısmı
            }
        }
        binding.btnTikla.setOnClickListener{
            Toast.makeText(applicationContext, "Ülke: ${ulkeler[binding.spinner.selectedItemPosition]}", Toast.LENGTH_SHORT).show()
        }
    }
}