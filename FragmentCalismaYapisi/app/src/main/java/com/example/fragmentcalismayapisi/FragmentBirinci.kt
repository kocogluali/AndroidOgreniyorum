package com.example.fragmentcalismayapisi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentcalismayapisi.databinding.Fragmentbirinci1Binding

class FragmentBirinci :Fragment()
{
    private  var _tasarim: Fragmentbirinci1Binding? = null
    private val tasarim get() = _tasarim!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _tasarim = Fragmentbirinci1Binding.inflate(inflater,container,false)
        _tasarim!!.buttonTikla.setOnClickListener {
            Toast.makeText(activity,"merhaba",Toast.LENGTH_SHORT).show()
        }
        val view = tasarim.root
        return view
    }
}

